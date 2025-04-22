package com.example.monefyuiautomation.screens

import com.example.monefyuiautomation.utils.TestUtils
import com.example.monefyuiautomation.utils.AddEntryUtils

class AddExpenseScreen {
    companion object{
        const val BILLS_CAT = "Bills"
        const val CAR_CAT = "Car"
        const val CLOTHES_CAT = "Clothes"
        const val COMMS_CAT = "Communications"
        const val EATING_CAT = "Eating out"
        const val ENTERTAINMENT_CAT = "Entertainment"
        const val FOOD_CAT = "Food"
        const val GIFTS_CAT = "Gifts"
        const val HEALTH_CAT = "Health"
        const val HOUSE_CAT = "House"
        const val PETS_CAT = "Pets"
        const val SPORTS_CAT = "Sports"
        const val TAXI_CAT = "Taxi"
        const val TOILETRY_CAT = "Toiletery"
        const val TRANSPORT_CAT = "Transport"
        const val TITLE = "New expense"
        const val ADD_CAT = "ADD"
    }
    init {
    }

    fun checkElementPresent() {
        TestUtils.waitForElement(TITLE)
        AddEntryUtils.checkElementPresent()
    }

    fun performCalculation(string: String): AddExpenseScreen{
        AddEntryUtils.performCalculation(string)
        return AddExpenseScreen()
    }

    fun clickBills(): HomeScreen {
        TestUtils.clickElementByText(BILLS_CAT)
        return HomeScreen()
    }

    fun clickChooseCategory(): AddExpenseScreen{
        AddEntryUtils.clickChooseCategory()
        return AddExpenseScreen()
    }

}
