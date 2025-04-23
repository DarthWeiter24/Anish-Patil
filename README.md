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

# Test Prioritization

| Charter No. | Charter Name                   | Why It Was Prioritized                                                             |
|-------------|--------------------------------|------------------------------------------------------------------------------------|
| 1           | First Time App Launch & Upsell | First impression and flow for a new user                                           |
| 2           | Add Expense                    | Core usecase needed for balance tracking                                           |
| 3           | Add Income                     | Core usecase needed for balance tracking                                           |
| 4           | Check Balance Screen           | Summary screen uses both Expense and Income                                        |
| 6           | Edit and Delete Transactions   | To check if entries are editable and errors can be deleted                         |
| 12          | Premium Features               | Wanted to verify if premium users actually get the features they’re paying for     |
| 5           | Search Transactions            | Search is super useful in a finance app, so checking if it’s accurate              |
| 13          | General Settings               | Changing currency is a frequently used usecase especially in EU                    |
| 7           | Google Drive Sync              | Synced the app with Drive to see if it actually backs things up properly           |
| 9           | Data Backup Functionalities    | Backups are a safety net, so I had to check if they work from start to finish      |
| 8           | Export to File                 | Exporting data should just work — wanted to see if the file looked good and usable |
| 10          | Record Transfer                | Reduced priority as long as all balance shows up correctly                        |
| 11          | Change Calendar View           | Reduced priority. As long as transaction shows up correctly                       |

# Test Run Summary
<details>
  <summary>Click to expand: Test Runs Summary</summary>

  ### Charter 1: First Time App Launch & Upsell
  - **Observed:**
    - Downloaded and installed from Playstore.
    - First time app launch worked as expected.
    - Upsell screen displayed and was closed to navigate to the home screen.
    - Calendar view was changed and relaunching the app kept the same view on the home screen.
  - **Issues:**
    - First time launch offer for a free 7-day trial did not work, causing an app crash after going through Play Store payment.
    - Upsell screen is displayed every time the app is closed and reopened, which feels pushy and disrupts user experience.
    - Suggested: Display the upsell after a time-out (e.g., XX days) to remind users without being too aggressive.

  ### Charter 2: Add Expense
  - **Observed:**
    - Added expense using the button at the bottom with different categories and notes.
    - Also added an expense from icons listed on the home screen.

  ### Charter 3: Add Income
  - **Observed:**
    - Tried adding different income categories with and without notes.
    - Income reflected correctly on the home screen and balance.

  ### Charter 4: Check Balance Screen
  - **Observed:**
    - Added expenses and income displayed on the Balance screen with notes and categories.
    - Filter by date and amount worked as expected.
  - **Issues:**
    - Filter only works in descending order, no option to filter ascending, especially for cost.
    - UI issue: As the list grows, text gets cut off abruptly over the buttons.

  ### Charter 6: Edit and Delete Transactions
  - **Observed:**
    - Editing and deleting income works as expected.
    - Editing and deleting expense updated the pie chart on the home screen.

  ### Charter 12: Premium Features
  - **Observed:**
    - Dark mode works as expected.
    - Able to add new categories in income and expense.
    - New expense category shows up on the home screen.
  - **Issues:**
    - Passcode applied but does not work; the app opens without requiring the passcode.
    - Passcode screen shows up after some time, and the entry box is misaligned with empty space at the bottom.

  ### Charter 5: Search Transactions
  - **Observed:**
    - **Issues:**
      - Search by category works only with the exact name, not partial terms (e.g., "Eating" doesn’t show results, only "Eating out").
      - Extra space between words is not handled in search.
      - Incorrect categories showing up in search (e.g., search for "Food" also shows Cash transfers).

  ### Charter 13: General Settings
  - **Observed:**
    - **Issues:**
      - Changing currency only alters the symbol, not the value. The amount displayed remains the same (e.g., $1000 changes to €1000).
      - Past entries should remain in the original currency for consistency and trust.

  ### Charter 7: Google Drive Sync
  - **Observed:**
    - **Issue:** Google Drive sync was successful, but no additional data appeared in the drive.

  ### Charter 9: Data Backup Functionalities
  - **Observed:**
    - Successfully able to make a backup, clear data, and restore from the backup.

  ### Charter 8: Export to File
  - **Observed:**
    - Able to export data and open it as a CSV file.
    - New category and notes section correctly exported.
    - Updated data reflected in newly generated files.
   
   ### Charter 10:  Record Transfer
   - **Observed:**
     - Spot check. Record event showed up successfully

   ### Charter 11: Change calendar view
   - **Observed:**
      - Spot check. Changed views reflected on home screen

</details>

# Issue Summary Table (Prioritized by P0–P3 Scale)

| No. | Priority | Charter     | Issue Description                                                                 | Notes / Impact                                                              |
|-----|----------|-------------|------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| 1   | P0       | Charter 1   | Free 7-day trial fails and causes app crash after payment via Play Store          | Core monetization feature broken; App crash = Reliability issue    |
| 2   | P0       | Charter 13  | Currency change only alters symbol, not value; affects historical accuracy        | Severe trust issue in financial app; impacts data integrity                 |
| 3   | P1       | Charter 12  | Passcode set, but app reopens without requiring it                                | Security issue, but lower impact as it intermittently triggers              |
| 4   | P1       | Charter 5   | Irrelevant results in search (e.g. “Food” shows cash transfers)                   | Data retrieval inconsistency; affects user confidence                       |
| 5   | P1       | Charter 7   | Flow for Google Drive sync successful, but no additional data appears in Drive    | Sync feedback misleading; creates confusion about data retention            |
| 6   | P2       | Charter 1   | Upsell screen shows on every app launch                                           | Negative UX; feels aggressive and repetitive                                |
| 7   | P2       | Charter 4   | Filter only works in descending order                                             | Usability limitation; restricts data review flexibility                     |
| 8   | P2       | Charter 5   | Search by category requires exact match; extra spaces not handled                 | Reduces discoverability; frustrating UX                                     |
| 9   | P2       | Charter 12  | Passcode entry boxes poorly aligned                                               | UI polish issue                                        |
|10   | P3       | Charter 4   | UI text cutoff as list grows                                                      | Minor visual issue; impacts readability on longer lists                     |

# Risks in Monefy App

1. **Data Integrity**  
   Since this is an app that deals with financial data, users expect a higher level of data integrity. Issues like data corruption, incorrect currency conversion, or inconsistent balances erode user trust and need to be thoroughly tested.

2. **Monetization Failure**  
   Failure in core monetization flows, such as the 7-day trial, can lead to poor user experience and significant loss of revenue.

3. **Security Risk**  
   Since this app deals with sensitive user data, security testing must be handled with priority. Otherwise, it could lead to hacks, data leaks, and fraud.

4. **Compliance and Legal Risk**  
   Financial apps must comply with various legal and regulatory standards, such as GDPR for data protection. Non-compliance can result in fines, even if the app has free users.

5. **Transactional and Calculation Errors**  
   Since the core use case of this app revolves around numerical operations like adding, updating, and deleting entries, accuracy is critical. Any bugs in these operations will erode user trust and could cause a significant drop in the app’s user base.

6. **Backup and Restore**  
   Backup operations act as a safety net for users. Any bugs in this process can lead to the loss of user data, especially in situations like phone upgrades, app reinstallation, or unexpected failures. As such, this flow should be flawless to avoid catastrophic data loss.

7. **Third-Party Service Dependence**  
   Sync operations rely on services like Dropbox and Google Drive. Any failure in these services could significantly impact the user experience by preventing data synchronization, leading to confusion or data inconsistency.

8. **User Experience Risk**  
   Any issues that frustrate users—such as repetitive upsell screens, improperly formatted buttons or screens, or confusing navigation—can cause friction and lead to a loss of trust in the app. This can result in a drop in user retention and poor Play Store reviews.

9. **Internationalization and Localization Risks**  
   If the app is expected to be used in different locales, it should have good support for various languages, especially character-based languages like Chinese, Japanese, and right-to-left languages like Arabic. Additionally, the app relies heavily on symbols for operations without text, which can be interpreted differently in different regions. Currency conversions should also be supported, especially in the EU, where users travel between countries with different currencies.
