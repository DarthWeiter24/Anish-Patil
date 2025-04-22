package com.example.monefyuiautomation.screens

import com.example.monefyuiautomation.utils.TestUtils

class HomeScreen {
    companion object {

        const val ADD_INCOME_BUTTON = "com.monefy.app.lite:id/income_button"
        const val ADD_EXPENSE_BUTTON = "com.monefy.app.lite:id/expense_button"

        const val BALANCE_AMOUNT = "com.monefy.app.lite:id/balance_amount"
        const val INCOME_AMOUNT = "com.monefy.app.lite:id/income_amount_text"
        const val EXPENSE_AMOUNT = "com.monefy.app.lite:id/expense_amount_text"

        const val INCOME_BUTTON ="com.monefy.app.lite:id/income_button"
        const val EXPENSE_BUTTON ="com.monefy.app.lite:id/expense_button"
    }
    init {
        checkElementPresent()
    }

    fun checkElementPresent(){
        TestUtils.waitForElement(ADD_INCOME_BUTTON)
        TestUtils.waitForElement(ADD_EXPENSE_BUTTON)
        TestUtils.waitForElement(BALANCE_AMOUNT)
        TestUtils.waitForElement(INCOME_AMOUNT)
        TestUtils.waitForElement(EXPENSE_AMOUNT)
        TestUtils.waitForElement(INCOME_BUTTON)
        TestUtils.waitForElement(EXPENSE_BUTTON)
    }


    fun clickAddIncome(): AddIncomeScreen{
        TestUtils.clickElement(ADD_INCOME_BUTTON)
        return AddIncomeScreen()
    }

    fun clickAddExpense(): AddExpenseScreen{
        TestUtils.clickElement(ADD_EXPENSE_BUTTON)
        return AddExpenseScreen()
    }
    fun getIncome(): Float {
        val incomeText = TestUtils.getText(INCOME_AMOUNT)
        val incomeOnly = incomeText.replace("$","").replace("[^0-9.]", "")
        return incomeOnly.toFloat()
    }

    fun getExpense(): Float{
        val expenseText = TestUtils.getText(EXPENSE_AMOUNT)
        val expenseOnly = expenseText.replace("$","").replace("[^0-9.]", "")
        return expenseOnly.toFloat()
    }

    fun getBalance(): Float {
        val balanceText = TestUtils.getText(BALANCE_AMOUNT)
        val balanceOnly = balanceText.replace("Balance $", "").replace("[^0-9.]", "")
        return balanceOnly.toFloat()
    }

    fun clickBalance(): BalanceScreen{
        TestUtils.clickElement(BALANCE_AMOUNT)
        return BalanceScreen()
    }

}


