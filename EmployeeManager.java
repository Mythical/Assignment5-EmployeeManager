
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();
    private HashSet<Integer> employeeIds = new HashSet<>();

    public void addEmployee(Employee employee) {
        if (employeeIds.contains(employee.getEmployeeId())) {
            System.out.println("Employee ID already exists. Cannot add employee.");
        } else {
            employees.add(employee);
            employeeIds.add(employee.getEmployeeId());
            System.out.println("Employee added successfully.");
        }
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Bonus: $" + String.format("%.2f", employee.calculateBonus()));
        }
    }

    public void updateSalary(int employeeId, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setSalary(newSalary);
                System.out.println("Updated Salary: $" + newSalary);
                System.out.println("New Bonus: $" + String.format("%.2f", employee.calculateBonus()));
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    
}
