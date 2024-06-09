import React, {Component, useEffect, useState} from 'react';
import {
  StyleSheet,
  SafeAreaView,
  View,
  Text,
  TouchableOpacity,
  Dimensions,
  NativeModules,
} from 'react-native';

const {width, height} = Dimensions.get('screen');

const {CustomCamera} = NativeModules;

const App = () => {
  useEffect(() => {
    openCameraScreen();
  }, []);

  // open camera activity
  const openCameraScreen = () => {
    CustomCamera.openCameraActivity();
  };

  return <SafeAreaView style={styles.container}></SafeAreaView>;
};

const styles = StyleSheet.create({
  container: {
    width,
    height,
  },
});

export default App;
