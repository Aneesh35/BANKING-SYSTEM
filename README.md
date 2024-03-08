# Banking System

The Banking System is a Java application that simulates basic banking operations such as account management and transactions. It allows bank employees to perform administrative tasks and users to conduct transactions on their accounts.

## Features

- **Bank Employee Operations:**
  - Open New Account: Create a new customer account with an initial deposit.
  - Open Existing Data: View existing customer account details.
  - Register ATM Agency: Register the bank at an ATM agency.
  - Delete Account: Delete an existing customer account.

- **User Transaction Operations:**
  - Do Transaction: Deposit funds into a customer account.
  - Withdraw Money: Withdraw funds from a customer account.

## Requirements

- Java Development Kit (JDK) 8 or higher
- MySQL database server
- MySQL Connector/J library

## Setup

1. **Database Configuration:**
   - Create a MySQL database named `netbanking`.
   - Run the provided SQL script (`queries.sql`) to create the necessary tables and structure.
   - Optionally, additional SQL queries can be found in the `queries.sql` file for database operations and analytics.

2. **Java Application:**
   - Clone or download the source code from the repository.

3. **Dependencies:**
   - Ensure that the MySQL Connector/J library is included in the project's dependencies.

4. **Configuration:**
   - Update the JDBC URL, username, and password in the `Banking` class according to your MySQL configuration.

5. **Build and Run:**
   - Compile the Java source files.
   - Run the `Banking` class to start the application.

## Usage

- Upon running the application, you'll be prompted with options to choose from:
  - Select the desired option by entering the corresponding number.

- For Bank Employee Operations:
  - Follow the on-screen instructions to perform administrative tasks.

- For User Transaction Operations:
  - Follow the on-screen instructions to conduct transactions on customer accounts.

## License

This project is licensed under the [License Name] License - see the [LICENSE](LICENSE) file for details.

---
