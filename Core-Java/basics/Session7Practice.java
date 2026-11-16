package basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Session7Practice {

    public static void main(String args[]) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
    public static void exercise1()
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println("Exercise 1: ");
        for(int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        for(Integer i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(a.size());
    }
    public static void exercise2()
    {
        System.out.println("\nExercise 2: ");
        ArrayList<String> names = new ArrayList<>();
        names.add("Pandaaaaaaaaa");
        names.add("Cr...");
        names.add("Cora");
        names.add("Hello");
        names.add("Rishi");
        names.add(2,"Crystal");
        names.set(0,"Panda");
        names.remove(4);
        System.out.println(names.contains("Rishi"));
        for(String i:names)
        {
            System.out.print(i+" ");
        }
    }
    public static void exercise3()
    {
        System.out.println("\n\nExercise 3: ");
        LinkedList<Integer> a=new LinkedList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.addFirst(5);
        a.addLast(40);
        a.removeFirst();
        System.out.println(a.getFirst()+" "+a.getLast());
    }
    public static void exercise4()
    {
        System.out.println("\nExercise 4: ");
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(10);
        a.add(30);
        a.add(40);
        a.add(20);
        a.add(50);
        int sum=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        for(Integer i:a)
        {
            sum+=i;
            if(i>max)
                max=i;
            if(i==10)
                c++;
        }
        System.out.println("Sum:" +sum);
        System.out.println("Max:" +max);
        System.out.println("Count:" +c);
        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.print(a.get(i)+" ");
        }
    }
}
