
public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }
}
