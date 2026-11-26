package basics.Session10Practice.UniversityStudentSystem;

abstract class Person {
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }

    abstract void displayRole();
    void introduce()
    {
        System.out.println("Name: "+name+" Age: "+age);
    }

}
