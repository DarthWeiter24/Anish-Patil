package com.example.monefyuiautomation.utils

import android.content.Intent
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import android.util.Log
import androidx.test.uiautomator.By

import androidx.test.uiautomator.Until

class TestUtils {
    companion object {
        private val device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        private const val TAG = "MonefyTest"

        fun launchApp(packageName: String) {
            try {
                val context = InstrumentationRegistry.getInstrumentation().context
                val packageManager = context.packageManager

                // Force-stop the app to start clean
                device.executeShellCommand("am force-stop $packageName")
                Thread.sleep(1000)

                // Launch app
                val intent = packageManager.getLaunchIntentForPackage(packageName)
                    ?: throw RuntimeException("Launch intent not found for $packageName")

                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)

                // Wait for the app to appear
                val launched = device.wait(Until.hasObject(By.pkg(packageName).depth(0)), 10000)
                if (!launched) throw RuntimeException("App $packageName failed to launch")

                Log.d(TAG, "Launched app: $packageName")

                // Optional delay for UI readiness
                Thread.sleep(2000)
            } catch (e: Exception) {
                Log.e(TAG, "Error launching app: ${e.message}")
                throw e
            }
        }

        fun clickElement_(resourceId: String) {
            device.findObject(By.res(resourceId)).click()
        }

        fun clickElement(resourceId: String) {
            waitForElement(resourceId)
            clickElement_(resourceId)
        }

        fun clickElementByContentDesc(contentDesc: String) {
            device.findObject(By.desc(contentDesc)).click()
        }

        fun waitForElement(resourceId: String, timeout: Long = 5000): Boolean {
            return device.wait(Until.hasObject(By.res(resourceId)), timeout)
        }

        fun clickElementByText(text: String) {
            device.findObject(By.text(text)).click()
        }

        fun getText(resourceId: String): String {
            return device.findObject(By.res(resourceId)).text
        }
    }
}