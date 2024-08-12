# SauceDemo Purchase Flow Automation

This project uses SerenityBDD with the Screenplay pattern to automate a purchase flow on the [SauceDemo](https://www.saucedemo.com/) website. It includes the setup for running end-to-end tests.

## 1. How to Clone the Project

1. Ensure you have [Git](https://git-scm.com/) installed on your machine.
2. Open your terminal or command prompt.
3. Clone the repository using the following command:

    ```bash
    git clone https://github.com/AlexAgTa/saucedemo-purchase-flow.git
    ```

4. Navigate into the project directory:

    ```bash
    cd saucedemo-purchase-flow
    ```

## 2. How to Configure Maven

1. **Ensure Maven is Installed**: You need Maven version 3.8.6. Follow [Maven installation instructions](https://maven.apache.org/install.html) if Maven is not installed.

2. **Check Maven Version**: Confirm Maven is installed and check its version:

    ```bash
    mvn -v
    ```

    Ensure the output shows Maven 3.8.6.

3. **Ensure JDK is Installed**: This project requires JDK version 1.8. Check your Java version:

    ```bash
    java -version
    ```

    Make sure the output shows JDK 1.8.

4. **Configure Maven**:
    - Ensure Maven is properly configured in your system's PATH.
    - Maven settings can be modified in `~/.m2/settings.xml` if needed.

## 3. How to Run the Tests

1. **Navigate to the Project Directory**:
    
    ```bash
    cd saucedemo-purchase-flow
    ```

2. **Run Tests Using Maven**:

    ```bash
    mvn clean verify
    ```

    This command will compile the project, run the tests, and generate reports.

3. **View the Reports**:
   - Serenity reports are typically located in the `target/site/serenity` directory.
   - Open `index.html` in a web browser to view the Serenity report.

## 4. Scenario Details

- **Maven Version**: 3.8.6
- **Java Version**: JDK 1.8
- **Framework**: SerenityBDD
- **Pattern**: Screenplay pattern

### Test Scenario

1. **Authentication**: Log in with the username `standard_user` and password `secret_sauce`.
2. **Add Products**: Add two products to the shopping cart.
3. **View Cart**: Navigate to the shopping cart.
4. **Complete Purchase**: Fill out the purchase form with the required details.
5. **Finalize Purchase**: Complete the purchase and verify that the confirmation message "THANK YOU FOR YOUR ORDER" is displayed.

Ensure all dependencies are resolved, and Maven is properly configured before running the tests. For any issues or further configuration, refer to the Maven and SerenityBDD documentation.

---

Feel free to adjust the repository URL and any other project-specific details as necessary.
