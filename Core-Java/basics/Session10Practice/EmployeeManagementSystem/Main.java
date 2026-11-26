package basics.Session10Practice.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Developer("Rishi", 101, 50000);
        Employee e2 = new Manager("Panda", 102, 70000);
        Developer d1=(Developer) e1;
        Manager m1=(Manager) e2;
        e1.displayDetails();
        e1.calculateSalary();
        d1.writeCode();
        d1.work();
        d1.work(5);
        e2.displayDetails();
        e2.calculateSalary();
        m1.conductMeeting();


    }
}
