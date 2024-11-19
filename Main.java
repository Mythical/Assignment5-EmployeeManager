
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Is the employee full-time? (yes/no): ");
                    String type = scanner.next();

                    if (type.equalsIgnoreCase("yes")) {
                        manager.addEmployee(new FullTimeEmployee(name, id, salary));
                    } else {
                        manager.addEmployee(new PartTimeEmployee(name, id, salary));
                    }
                    break;

                case 2:
                    manager.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter employee ID to update salary: ");
                    int empId = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    manager.updateSalary(empId, newSalary);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
