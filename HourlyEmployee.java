package project1;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double wage;

    public HourlyEmployee(String name, String employeeID, double hoursWorked, double wage) {
        super(name, employeeID);
        this.hoursWorked = hoursWorked;
        this.wage = wage;
    }

    @Override
    public double getPaymentAmount() {
        return hoursWorked * wage;
    }
}
