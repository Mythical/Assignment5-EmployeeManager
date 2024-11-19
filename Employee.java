
public abstract class Employee implements BonusCalculable {
    protected String name;
    protected int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    public abstract double calculateBonus();

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: $" + salary);
    }
}
