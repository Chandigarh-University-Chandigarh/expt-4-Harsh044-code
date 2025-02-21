class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.printf("ID: %d, Name: %s, Department: %s, Salary: %.2f\n", 
            id, name, department, salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Employee[] employees = new Employee[n];
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count < n) {
                        System.out.print("Enter employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Enter employee name: ");
                        String name = scanner.nextLine();
                        
                        System.out.print("Enter department: ");
                        String department = scanner.nextLine();
                        
                        System.out.print("Enter salary: ");
                        double salary = scanner.nextDouble();
                        
                        employees[count] = new Employee(id, name, department, salary);
                        count++;
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Employee array is full!");
                    }
                    break;
                
                case 2:
                    if (count == 0) {
                        System.out.println("No employees to display!");
                    } else {
                        System.out.println("\nEmployee List:");
                        for (int i = 0; i < count; i++) {
                            employees[i].displayEmployee();
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}