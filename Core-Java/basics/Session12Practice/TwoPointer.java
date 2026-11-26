package basics.Session12Practice;

public class TwoPointer
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 14;
        if(hasPairWithSum(arr,target))
            System.out.println("Target found");
        else
            System.out.println("Target not found");
    }

    public static boolean hasPairWithSum(int[] arr, int target)
    {
        int n=arr.length;
        for(int i=0,j=n-1;i<j;)
        {
            int sum = arr[i] + arr[j];
            if(sum < target)
                i++;
            else if(sum > target)
                j--;
            else
                return true;
        }
        return false;
    }
}
