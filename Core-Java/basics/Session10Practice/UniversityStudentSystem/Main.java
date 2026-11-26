package basics.Session10Practice.UniversityStudentSystem;



public class Main {
    public static void main(String[] args)
    {
        Student s1=new Student("Rishi",23,101);
        Student s2=new Student("Panda",22,102);
        System.out.println("Name: "+s1.getName()+"\nAge: "+s1.getAge()+"\nRoll No: "+s1.getRollNo());
        s1.displayRole();
        Student.displayCollege();
        System.out.println("\nName: "+s2.getName()+"\nAge: "+s2.getAge()+"\nRoll No: "+s2.getRollNo());
        s2.displayRole();
        Student.displayCollege();


    }

}
