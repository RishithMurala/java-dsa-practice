package basics.Session10Practice.EmployeeManagementSystem;

abstract class Employee {
    private String name;
    private int employeeId;
    private static final String companyName = "ABC";

    Employee(String name, int employeeId)
    {
        this.name=name;
        this.employeeId=employeeId;
    }
    String getName()
    {
        return name;
    }
    int getEmployeeId()
    {
        return employeeId;
    }
    abstract void calculateSalary();
    void displayDetails()
    {
        System.out.println("Employee: "+name+"\nID: "+employeeId);
    }


}
