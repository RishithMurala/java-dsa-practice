package basics;

import java.util.HashSet;

public class Session8Practice {
    public static void main(String[] args)
    {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        challenge1();
    }
    public static void exercise1()
    {
        int[] nums = {45, 12, 78, 23, 9, 56};
        int min=nums[0];
        int max=nums[0];
        for(int i:nums)
        {
            if(i<min)
                min=i;
            if(i>max)
                max=i;
        }
        System.out.println("Exercise 1: ");
        System.out.println("Min: "+min+" Max: "+max);
    }
    public static void exercise2()
    {
        System.out.println("\nExercise 2: ");
        int[] nums = {1, 2, 2, 3, 1, 2, 4, 3, 2};
        int[] freq = new int[5];
        for(int i:nums)
        {
            freq[i]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
                System.out.println(i+": "+freq[i]);
        }
    }
    public static void exercise3()
    {
        System.out.println("\nExercise 3: ");
        int[] nums = {4, 2, 7, 2, 8, 4, 9};
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i:nums)
        {
            if(!set1.add(i))
            {
                set2.add(i);
            }
        }
        System.out.println(set2);
    }
    public static void exercise4()
    {
        System.out.println("\nExercise 4: ");
        int[] nums = {2, 4, 6, 8, 10};
        int target = 12;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println(nums[i]+" "+nums[j]);
                }
            }
        }
    }
    public static void exercise5()
    {
        System.out.println("\nExercise 5: ");
        int[] nums = {5, 3, 5, 2, 5, 7, 3, 5};
        int target = 5;
        int count=0;
        for(int i:nums)
        {
            if(target==i)
                count++;
        }
        System.out.println("Count: "+count);
    }
    public static void challenge1()
    {
        System.out.println("\nChallenge 1: ");
        int[] nums = {4, 2, 7, 2, 8, 4, 9};
        HashSet<Integer> numbers=new HashSet<>();
        for(int i:nums)
        {
            if(!numbers.add(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
