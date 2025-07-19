class MissingNumber {
    public static int missingNumber(int[] nums)
    {
        int N=nums.length;
        int sum=(N * (N + 1)) / 2;
        int sum2=0;
        for(int i=0;i<N-1;i++)
        {
            sum2+=nums[i];
        }
        int missingNo=sum-sum2;
        return missingNo;
    }
    public static void main(String args[]) {
        int a[] = {1, 2, 4, 5};
        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }
 }
