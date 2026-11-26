package basics.Session10Practice.UniversityStudentSystem;

public class Student extends Person{
    private int rollNo;
    private static final String collegeName = "ABC University";
    Student(String name, int age, int rollNo)
    {
        super(name, age);
        this.rollNo=rollNo;

    }
    int getRollNo()
    {
        return rollNo;
    }
    @Override
    void displayRole() {
        System.out.println("I am a student");
    }

    static void displayCollege()
    {
        System.out.println("College: "+collegeName);
    }
}
