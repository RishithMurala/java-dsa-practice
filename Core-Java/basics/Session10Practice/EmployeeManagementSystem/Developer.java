package basics.Session10Practice.EmployeeManagementSystem;

public class Developer extends Employee{
    private int monthlySalary;
    Developer(String employeeName, int employeeId, int monthlySalary)
    {
        super(employeeName, employeeId);
        this.monthlySalary=monthlySalary;
    }
    @Override
    void calculateSalary()
    {
        System.out.println("Salary: "+monthlySalary);
    }
    void writeCode()
    {
        System.out.println("Writing code...\n");
    }

    void work()
    {
        System.out.println("Doing work");
    }
    void work(int hours)
    {
        System.out.println("Doing "+hours+" hours of work\n");
    }
}
