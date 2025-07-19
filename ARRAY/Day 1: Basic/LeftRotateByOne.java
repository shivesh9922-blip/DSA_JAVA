class LeftRotateByOne {
    
    public static void leftRotateByOne(int[] nums)
    {
        int n=nums.length;
        int temp=nums[0];
        
        for(int i=0;i<n-1;i++)
        {
            nums[i]=nums[i+1];
        }
        nums[n-1]=temp;
        for(int i=0;i<n;i++)
        {
           System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5};
        leftRotateByOne(nums);
    }
 }
