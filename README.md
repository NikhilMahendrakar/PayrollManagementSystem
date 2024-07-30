# Employee Management System

This is a Java-based Employee Management System that allows for managing employee details, attendance, salary, and loans. It provides a comprehensive interface for performing CRUD (Create, Read, Update, Delete) operations on employee records.

## Features

- **Employee Management**: Add, update, and list employee details.
- **Attendance Management**: Record and update attendance for employees.
- **Salary Management**: Calculate and update salaries for employees.
- **Loan Management**: Manage loans taken by employees.
- **Report Generation**: Generate pay slips and loan slips.

## Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/employee-management-system.git
    cd employee-management-system
    ```

2. **Set up the database**:
    - Create a database using the provided `db.sql` script.
    - Ensure the database connection details in `conn.java` are correctly configured to connect to your database.

3. **Compile the project**:
    - Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
    - Compile the project to resolve dependencies.

4. **Run the project**:
    - Run the main class `project.java` to start the application.

## Usage

1. **Login**:
    - Use the login screen (`login.java`) to enter the system. Default credentials can be set in the database.

2. **Employee Management**:
    - Add a new employee using `New_Employee.java`.
    - Update existing employee details with `Update_employee.java`.
    - List all employees using `List_Employee.java`.

3. **Attendance Management**:
    - Record attendance using `TakeAttendence.java`.
    - List attendance records with `List_Attendence.java`.

4. **Salary Management**:
    - Update salary details with `Update_salary.java`.
    - Generate pay slips using `pay_slip.java`.
    - Calculate salary in `Salary.java`.

5. **Loan Management**:
    - Record new loans with `Loan_Taken.java`.
    - Update existing loans using `Update_loan.java`.
    - Generate loan slips using `loan_slip.java`.


## Contributing

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.



