# 🧪 Magento QA Automation Project

This is an end-to-end **QA automation framework** for the [Magento Demo Store](https://magento.softwaretestingboard.com/), developed using **Java**, **Selenium WebDriver**, and the **Page Object Model (POM)** pattern. The suite validates essential user functionalities like account registration, login, password update, and re-login.

---

## 🔍 Key Features

- ✅ **User Registration:** Automates account signup with valid data.  
- ✅ **Login Automation:** Validates successful login using registered credentials.  
- ✅ **Password Change:** Updates account password from the dashboard.  
- ✅ **Re-login Flow:** Confirms login success using the newly updated password.  
- 📄 **Excel-based Test Documentation:** Test scenarios are well-defined and documented in Excel.  
- 💡 **POM Architecture:** Follows clean separation of concerns for reusable and maintainable code.

---

## 💻 Tech Stack

| Category       | Tools & Technologies                |
|----------------|-------------------------------------|
| Language       | Java                                |
| Automation     | Selenium WebDriver                  |
| Design Pattern | Page Object Model (POM)             |
| Build Tool     | Maven                               |
| IDE            | IntelliJ IDEA / Eclipse             |
| Documentation  | Excel-based Manual Test Cases       |

---

## 📁 Project Structure

<pre>
Magento/
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── magento/
│   │   │       └── test_magento.java      # Main test class
│   │   └── resources/                     # (Optional: configs or locators)
│   └── test/                              # (Optional: TestNG files/utilities)
├── target/                                # Compiled classes
├── pom.xml                                # Maven project config
└── .gitignore
</pre>

---

## 🚀 How to Run

1. Clone the repository.
2. Open the project in **IntelliJ IDEA** or **Eclipse**.
3. Use Maven to install dependencies from `pom.xml`.
4. Make sure **ChromeDriver** is installed and accessible via system path.
5. Run the `test_magento.java` file to execute the test suite.

---

## 📄 Test Coverage

The following scenarios are automated and tested:
1. **Create New Account**
2. **Login with Registered Credentials**
3. **Change Account Password**
4. **Re-login Using Changed Password**

Test case details are documented in the Excel file in a QA-standard format.

---

## 📬 Contributions & Feedback

Feel free to raise issues or pull requests for improvements.  
This project is built for learning and demonstrating automation testing best practices.

---
