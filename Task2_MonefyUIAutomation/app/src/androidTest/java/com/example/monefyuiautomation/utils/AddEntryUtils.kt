package com.example.monefyuiautomation.utils

import com.example.monefyuiautomation.screens.HomeScreen
import com.example.monefyuiautomation.screens.UpSellScreen.Companion.CLOSE_BUTTON

class AddEntryUtils {
    companion object {
        const val BUTTON_1 = "com.monefy.app.lite:id/buttonKeyboard1"
        const val BUTTON_2 = "com.monefy.app.lite:id/buttonKeyboard2"
        const val BUTTON_3 = "com.monefy.app.lite:id/buttonKeyboard3"
        const val BUTTON_4 = "com.monefy.app.lite:id/buttonKeyboard4"
        const val BUTTON_5 = "com.monefy.app.lite:id/buttonKeyboard5"
        const val BUTTON_6 = "com.monefy.app.lite:id/buttonKeyboard6"
        const val BUTTON_7 = "com.monefy.app.lite:id/buttonKeyboard7"
        const val BUTTON_8 = "com.monefy.app.lite:id/buttonKeyboard8"
        const val BUTTON_9 = "com.monefy.app.lite:id/buttonKeyboard9"
        const val BUTTON_0 = "com.monefy.app.lite:id/buttonKeyboard0"
        const val BUTTON_PLUS = "com.monefy.app.lite:id/buttonKeyboardPlus"
        const val BUTTON_MINUS = "com.monefy.app.lite:id/buttonKeyboardMinus"
        const val BUTTON_MULTIPLY = "com.monefy.app.lite:id/buttonKeyboardMultiply"
        const val BUTTON_DIVIDE = "com.monefy.app.lite:id/buttonKeyboardDivide"
        const val BUTTON_EQUALS = "com.monefy.app.lite:id/buttonKeyboardEquals"
        const val BUTTON_DOT = "com.monefy.app.lite:id/buttonKeyboardDot"
        const val BUTTON_CLEAR = "com.monefy.app.lite:id/buttonKeyboardClear"
        const val BACK_BUTTON = "Navigate up"
        const val CHOOSE_CATEGORY = "com.monefy.app.lite:id/keyboard_action_button"

        // Click the back button and return to HomeScreen
        fun clickBackButton(): HomeScreen {
            TestUtils.clickElementByContentDesc(BACK_BUTTON)
            return HomeScreen()
        }

        // Check if all elements are present
        fun checkElementPresent() {
            TestUtils.waitForElement(BUTTON_0)
            TestUtils.waitForElement(BUTTON_1)
            TestUtils.waitForElement(BUTTON_2)
            TestUtils.waitForElement(BUTTON_3)
            TestUtils.waitForElement(BUTTON_4)
            TestUtils.waitForElement(BUTTON_5)
            TestUtils.waitForElement(BUTTON_6)
            TestUtils.waitForElement(BUTTON_7)
            TestUtils.waitForElement(BUTTON_8)
            TestUtils.waitForElement(BUTTON_9)
            TestUtils.waitForElement(BUTTON_PLUS)
            TestUtils.waitForElement(BUTTON_MINUS)
            TestUtils.waitForElement(BUTTON_MULTIPLY)
            TestUtils.waitForElement(BUTTON_DIVIDE)
            TestUtils.waitForElement(BUTTON_EQUALS)
            TestUtils.waitForElement(BUTTON_DOT)
            TestUtils.waitForElement(BUTTON_CLEAR)
            TestUtils.waitForElement(CHOOSE_CATEGORY)
        }

        // Enter the input string and perform calculations
        fun performCalculation(input: String) {
            checkElementPresent()
            input.forEach { char ->
                when (char) {
                    '0' -> TestUtils.clickElement(BUTTON_0)
                    '1' -> TestUtils.clickElement(BUTTON_1)
                    '2' -> TestUtils.clickElement(BUTTON_2)
                    '3' -> TestUtils.clickElement(BUTTON_3)
                    '4' -> TestUtils.clickElement(BUTTON_4)
                    '5' -> TestUtils.clickElement(BUTTON_5)
                    '6' -> TestUtils.clickElement(BUTTON_6)
                    '7' -> TestUtils.clickElement(BUTTON_7)
                    '8' -> TestUtils.clickElement(BUTTON_8)
                    '9' -> TestUtils.clickElement(BUTTON_9)
                    '+' -> TestUtils.clickElement(BUTTON_PLUS)
                    '-' -> TestUtils.clickElement(BUTTON_MINUS)
                    '*' -> TestUtils.clickElement(BUTTON_MULTIPLY)
                    '/' -> TestUtils.clickElement(BUTTON_DIVIDE)
                    '.' -> TestUtils.clickElement(BUTTON_DOT)
                    '=' -> TestUtils.clickElement(BUTTON_EQUALS)
                    else -> throw IllegalArgumentException("Unsupported character: $char")
                }
            }
        }

        // Click to choose category
        fun clickChooseCategory() {
            TestUtils.clickElement(CHOOSE_CATEGORY)
        }
    }
}