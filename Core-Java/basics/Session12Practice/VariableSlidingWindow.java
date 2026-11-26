package basics.Session12Practice;

public class VariableSlidingWindow {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 2, 3, 2};
        int target = 7;
        System.out.println("Min subarray length: "+minsubarray(a,target));

    }
    public static int minsubarray(int a[],int target)
    {
        int left=0;
        int sum=0;
        int minlength = Integer.MAX_VALUE;

        for(int right=0;right<a.length;right++)
        {
            sum+=a[right];
            while(sum>=target)
            {
                minlength =Math.min(minlength, right-left+1);
                sum-=a[left];
                left++;
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}


