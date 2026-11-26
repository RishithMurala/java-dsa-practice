package basics.Session12Practice;

public class MaximumSumSubarrayofSizeK {
    public static void main(String[] args)
    {
        int[] a = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarray(a,k));
    }
    public static int maxSumSubarray(int[] a, int k)
    {
        int sum=0;
        int maxSum;
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        maxSum=sum;
        for(int i=1;i<=a.length-k;i++)
        {
            sum=sum-a[i-1]+a[i+k-1];
            if(maxSum<sum)
                maxSum=sum;

        }
        return maxSum;
    }
}
