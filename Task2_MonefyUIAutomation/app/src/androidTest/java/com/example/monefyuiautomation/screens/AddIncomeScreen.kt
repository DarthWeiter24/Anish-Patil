package com.example.monefyuiautomation.screens

import com.example.monefyuiautomation.utils.TestUtils
import com.example.monefyuiautomation.utils.AddEntryUtils

class AddIncomeScreen {
    companion object{
        const val DEPOSIT_CAT = "Deposits"
        const val SALARY_CAT = "Salary"
        const val SAVINGS_CAT = "Savings"
        const val TITLE = "New income"
        const val ADD_CAT = "ADD"
    }

    init {
    }

    fun checkElementPresent() {
        TestUtils.waitForElement(TITLE)
        AddEntryUtils.checkElementPresent()
    }

    fun clickDeposit(): HomeScreen {
        TestUtils.clickElementByText(DEPOSIT_CAT)
        return HomeScreen()
    }

    fun clickSalary(): HomeScreen {
        TestUtils.clickElementByText(SALARY_CAT)
        return HomeScreen()
    }
    fun clickSavings(): HomeScreen {
        TestUtils.clickElementByText(SAVINGS_CAT)
        return HomeScreen()
    }
    fun performCalculation(string: String): AddIncomeScreen{
        AddEntryUtils.performCalculation(string)
        return AddIncomeScreen()
    }

    fun clickChooseCategory(): AddIncomeScreen{
        AddEntryUtils.clickChooseCategory()
        return AddIncomeScreen()
    }



}