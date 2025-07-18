class SecondLargSmall {
     public static int secondLargest(int[] nums)
        {
            int n=nums.length;
            if(n<2)
            {
                return -1;
            }
            int largest=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(nums[i]>largest)
                {
                    secondLargest=largest;
                    largest=nums[i];
                }
                if(nums[i]>secondLargest && nums[i]!=largest)
                {
                    secondLargest=nums[i];
                }
            }
            return secondLargest;
        }
        
         public static int secondSmallest(int[] nums)
        {
            int n=nums.length;
            if(n<2)
            {
                return -1;
            }
            int smallest=Integer.MAX_VALUE;
            int secondSmallest=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                if(nums[i]<smallest)
                {
                    secondSmallest=smallest;
                    smallest=nums[i];
                }
                if(nums[i]<secondSmallest && nums[i]!=smallest)
                {
                    secondSmallest=nums[i];
                }
                
            }
            return secondSmallest;
        }
    public static void main(String[] args) {
    int[] nums = {1, 2, 4, 7, 7, 5};
    int sS = secondSmallest(nums);
    int sL = secondLargest(nums);    
 System.out.println("Second smallest is "+sS);
 System.out.println("Second largest is "+sL);
    }
 }
