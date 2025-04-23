# **Task 1: Exploratory Testing Charter**

- **App:** Monefy  
- **Version:** 1.22.2 (com.monefy.app.lite)  
- **Phone:** Google Pixel 8 Pro  
- **Phone OS:** Android 15  
- **Duration:** 2 hours  

---

## **Charter 1 - First Time App Launch and Upsell Experience**
- **Explore**: The Monefy app on first app launch  
- **Using**: Monefy (Android app version) and Google Pixel 8 Pro  
- **To Discover**: App launch flow, Upsell, and navigation to the home screen  

---

## **Charter 2 - Add Expense**
- **Explore**: Core functionality to add expense  
- **Using**: Manual inputs and different categories  
- **To Discover**: If expenses are saved correctly, categories update totals, and UI responds smoothly  

---

## **Charter 3 - Add Income**
- **Explore**: Core functionality to add income  
- **Using**: Manual inputs and different categories  
- **To Discover**: If income is saved correctly, categories update totals, and UI responds smoothly  

---

## **Charter 4 - Check Balance Screen**
- **Explore**: The balance screen  
- **Using**: Previously saved income and expense  
- **To Discover**: If changes from income and expense addition, update, deletion are reflected in the balance screen  

---

## **Charter 5 - Edit and Delete Transactions**
- **Explore**: The edit and delete transactions functionality  
- **Using**: Balance tab and previously saved transaction  
- **To Discover**: If changes are saved, UI is updated, and deletion is reflected on balance and income/expense  

---

## **Charter 6 - Search Transactions**
- **Explore**: The search functionality  
- **Using**: Search button and previously saved transactions in different categories  
- **To Discover**: If multiple categories and transactions are accurately searchable, and deleted transactions are not cached and show up in searches  

---

## **Charter 7 - Dropbox and Google Drive Synchronisation**
- **Explore**: Sync functionality  
- **Using**: Premium plan, Google Drive, and Dropbox  
- **To Discover**: Issues related to sync, data retention, and retrieval from external sources  

---

## **Charter 8 - Export to File**
- **Explore**: Option to export user data  
- **Using**: Previously saved data from different categories and export option in settings  
- **To Discover**: If data is correctly formatted, readable, and maintains data fidelity  

---

## **Charter 9 - Data Backup Functionalities**
- **Explore**: Backup creation, restoration, and deletion  
- **Using**: Data backup option in settings, stored on phone local storage  
- **To Discover**: Successful backup creation, retrieval, and deletion  

---

## **Charter 10 - Record Transfer**
- **Explore**: Recording transfers between cards and cash  
- **Using**: Transfer option on the Home Screen  
- **To Discover**: If transfer records are accessible in the app, and show up as expenses, income, or other  

---

## **Charter 11 - Change Calendar View**
- **Explore**: Different calendar views in the app  
- **Using**: Day, week, month, year, and custom options in the left pane  
- **To Discover**: If records of transactions are accurately reflected in each view

---

## Charter 12 - Premium Features

**Explore** Dark mode, Passcode, Backup mode, adding new categories  
**Using** Premium subscription  
**To Discover** if functionality works as expected, user flows are successful, and premium users have a positive user experience

---

## Charter 13 - General Settings

**Explore** Settings features like currency, language  
**Using** Settings from Right Pane in home screen  
**To Discover** smooth functionality and data integrity on settings change


# Issue Summary Table (Prioritized by P0–P3 Scale)

| No. | Priority | Charter     | Issue Description                                                                 | Notes / Impact                                                              |
|-----|----------|-------------|------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| 1   | P0       | Charter 1   | Free 7-day trial fails and causes app crash after payment via Play Store          | Core monetization feature broken; app crash = critical reliability issue    |
| 2   | P0       | Charter 13  | Currency change only alters symbol, not value; affects historical accuracy        | Severe trust issue in financial app; impacts data integrity                 |
| 3   | P1       | Charter 12  | Passcode set, but app reopens without requiring it                                | Security issue, but lower impact as it intermittently triggers              |
| 4   | P1       | Charter 5   | Irrelevant results in search (e.g. “Food” shows cash transfers)                   | Data retrieval inconsistency; affects user confidence                       |
| 5   | P1       | Charter 7   | Flow for Google Drive sync successful, but no additional data appears in Drive    | Sync feedback misleading; creates confusion about data retention            |
| 6   | P2       | Charter 1   | Upsell screen shows on every app launch                                           | Negative UX; feels aggressive and repetitive                                |
| 7   | P2       | Charter 4   | Filter only works in descending order                                             | Usability limitation; restricts data review flexibility                     |
| 8   | P2       | Charter 5   | Search by category requires exact match; extra spaces not handled                 | Reduces discoverability; frustrating UX                                     |
| 9   | P2       | Charter 12  | Passcode screen shows up delayed; boxes poorly aligned                            | UI polish issue; confusing for user                                         |
|10   | P3       | Charter 4   | UI text cutoff as list grows                                                      | Minor visual issue; impacts readability on longer lists                     |

