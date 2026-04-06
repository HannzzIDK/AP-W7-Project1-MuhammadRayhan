package project1;

public abstract class Employee implements Payable {
    private String Name;
    private String EmployeeID;

    public Employee(String name, String employeeID) {
        this.Name = name;
        this.EmployeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }
}
