# Employee Management System

This is a simple command-line based Employee Management System implemented in Java. The system allows users to add employees and display their details.

## Features

- Add new employees with details such as ID, name, department, and salary.
- Display a list of all employees.
- Simple and intuitive menu-driven interface.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A Java IDE (like IntelliJ IDEA, Eclipse) or a text editor (like VSCode) with Java support.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   ```

2. Navigate to the project directory:

   ```bash
   cd employee-management-system
   ```

### Usage

1. Compile the Java program:

   ```bash
   javac EmployeeManagement.java
   ```

2. Run the compiled Java program:

   ```bash
   java EmployeeManagement
   ```

3. Follow the on-screen menu to add employees and display their details.

## Code Structure

- **Employee Class**: Represents an employee with attributes like ID, name, department, and salary. It includes a method to display employee details.
- **EmployeeManagement Class**: Contains the main method to run the program. It handles user input and manages the list of employees.

## Example

```plaintext
Enter the number of employees: 3

Menu:
1. Add Employee
2. Display Employees
3. Exit
Choose an option: 1
Enter employee ID: 101
Enter employee name: John Doe
Enter department: HR
Enter salary: 50000
Employee added successfully!

Menu:
1. Add Employee
2. Display Employees
3. Exit
Choose an option: 2

Employee List:
ID: 101, Name: John Doe, Department: HR, Salary: 50000.00
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, feel free to open an issue or contact the maintainer.

