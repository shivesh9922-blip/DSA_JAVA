class MoveZeros {
    public static int[] moveZeros(int[] nums)
    {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return nums;
        }
        for(int i=j+1;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] ans = moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
 }
