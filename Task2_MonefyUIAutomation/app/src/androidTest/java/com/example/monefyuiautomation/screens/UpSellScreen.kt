package com.example.monefyuiautomation.screens

import com.example.monefyuiautomation.utils.TestUtils


class UpSellScreen {
    companion object{
        const val CLOSE_BUTTON = "com.monefy.app.lite:id/buttonClose"
        const val TITLE_TEXT = "Become your own budgeting hero"
        const val PURCHASE_BUTTON = "com.monefy.app.lite:id/buttonPurchase"
    }
    init {
        checkElementPresent()
    }

    fun checkElementPresent(){
        // Check if the elements are present when the UpSellScreen is initialized
        TestUtils.waitForElement(CLOSE_BUTTON)
        TestUtils.waitForElement(TITLE_TEXT)
        TestUtils.waitForElement(PURCHASE_BUTTON)
    }

    fun clickCloseButton(): HomeScreen{
        TestUtils.clickElement(CLOSE_BUTTON)
        return HomeScreen()
    }
}