package com.rn_object_detection.CustomCamera
import android.content.Intent
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.rn_object_detection.CameraActivity

class CustomCamera(reactContext: ReactApplicationContext) :
ReactContextBaseJavaModule(reactContext){

    private val packageName: String = "CustomCamera"
    private val tag:String = "TAG"
    override fun getName(): String {
        return packageName
    }

    @ReactMethod
    fun printMessage(message: String) {
        Log.d(tag, "Message: $message")
    }

    @ReactMethod
    fun openCameraActivity() {
        val intent = Intent(currentActivity, CameraActivity::class.java)
        currentActivity?.startActivity(intent)
    }

}