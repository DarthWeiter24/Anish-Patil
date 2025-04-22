package com.example.monefyuiautomation.screens

import com.example.monefyuiautomation.utils.TestUtils

class BalanceScreen {
    companion object{
        const val INCOME_BUTTON ="com.monefy.app.lite:id/income_button"
        const val EXPENSE_BUTTON ="com.monefy.app.lite:id/expense_button"
        const val BALANCE_AMOUNT = "com.monefy.app.lite:id/balance_amount"
        const val SEARCH = "com.monefy.app.lite:id/menu_search"
        const val TRANSFER = "com.monefy.app.lite:id/transfer_menu_item"
        const val TITLE = "Monefy"
    }

    init {
        checkElementPresent()
    }

    fun checkElementPresent(){
        TestUtils.waitForElement(INCOME_BUTTON)
        TestUtils.waitForElement(EXPENSE_BUTTON)
    }

    fun getBalance(): Float {
        val balanceText = TestUtils.getText(BALANCE_AMOUNT)
        val balanceOnly = balanceText.replace("Balance $", "").replace("[^0-9.]", "")
        return balanceOnly.toFloat()
    }

    fun clickBalance(): HomeScreen{
        TestUtils.clickElement(BALANCE_AMOUNT)
        return HomeScreen()
    }

}