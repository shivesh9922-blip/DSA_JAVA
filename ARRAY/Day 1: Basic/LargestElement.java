class LargestElement {
    public static int largestElement(int[] nums)
    {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={5,7,1,2,9,14,23};
        System.out.println(largestElement(nums));
    }
 }
