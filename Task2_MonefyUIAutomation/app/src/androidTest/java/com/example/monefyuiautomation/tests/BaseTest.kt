package com.example.monefyuiautomation.tests

import com.example.monefyuiautomation.screens.BalanceScreen
import com.example.monefyuiautomation.screens.HomeScreen
import com.example.monefyuiautomation.utils.TestUtils
import com.example.monefyuiautomation.screens.UpSellScreen
import org.junit.Test
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class BaseTest {
    @Test
    fun test_01_LaunchMonefyLite() {
        TestUtils.launchApp("com.monefy.app.lite")
        Thread.sleep(3000)
        val upSellScreen = UpSellScreen()
        upSellScreen.clickCloseButton()
    }

    @Test
    fun test_02_AddIncome(){
        val homeScreen = HomeScreen()
        val incomeBefore = homeScreen.getIncome()
        homeScreen.clickAddIncome().performCalculation("10").clickChooseCategory().clickDeposit()
        val incomeAfter = homeScreen.getIncome()
        assert((incomeAfter-incomeBefore)== 10.toFloat())
    }

    @Test
    fun test_03_AddExpense(){
        val homeScreen = HomeScreen()
        val expenseBefore = homeScreen.getExpense()
        homeScreen.clickAddExpense().performCalculation("10").clickChooseCategory().clickBills()
        val expenseAfter = homeScreen.getExpense()
        assert((expenseAfter-expenseBefore)== 10.toFloat())
    }

    @Test
    fun test_04_BalanceIntegrity(){
        val homeScreen = HomeScreen()
        val expense = homeScreen.getExpense()
        val income = homeScreen.getIncome()
        val balance = homeScreen.getBalance()
        assert ((income-expense)==balance)
    }

    @Test
    fun test_05_checkBalanceScreen(){
        val homeScreen = HomeScreen()
        val balanceHome = homeScreen.getBalance()
        val balanceFromScreen = homeScreen.clickBalance().getBalance()
        val balanceScreen = BalanceScreen()
        balanceScreen.clickBalance()
        assert(balanceHome==balanceFromScreen)
    }
}