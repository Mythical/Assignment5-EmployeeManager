
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}
