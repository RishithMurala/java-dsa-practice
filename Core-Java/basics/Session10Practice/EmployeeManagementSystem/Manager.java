package basics.Session10Practice.EmployeeManagementSystem;

public class Manager extends Employee{
    private int monthlySalary;
    Manager(String employeeName, int employeeId, int monthlySalary)
    {
        super(employeeName, employeeId);
        this.monthlySalary=monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary: "+monthlySalary);
    }
    void conductMeeting()
    {
        System.out.println("Conducting meeting...\n");
    }
}
