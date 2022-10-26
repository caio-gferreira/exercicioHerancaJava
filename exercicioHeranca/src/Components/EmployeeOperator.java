package Components;

public class EmployeeOperator extends Employee {
    private double hourValue;

    public EmployeeOperator() {
        this.setJobPosition("Operador");
    }

    public double getHourValue() {
        return this.hourValue;
    }

    public double setHourValue(double hourValue) {
        return this.hourValue = hourValue;
    }
}
