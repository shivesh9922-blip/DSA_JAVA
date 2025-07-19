 class RotatetoleftOrRight {
    public static void reverse(int[] nums,int start,int end)
    {
       while(start<=end)
       {
           int temp=nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++;
           end--;
       }
    }
    
    public static void rotateToleft(int[] nums,int n,int k)
    {
    // Reverse first k elements
        reverse(nums,0,k-1);
    // Reverse last n-k elements
        reverse(nums,k,n-1);
    // Reverse whole array
        reverse(nums,0,n-1);
    }
   
     public static void rotateToRight(int[] nums,int n,int k)
    {
    // Reverse first n-k elements
    reverse(nums, 0, n - k - 1);
    // Reverse last k elements
    reverse(nums, n - k, n - 1);
    // Reverse whole array
    reverse(nums, 0, n - 1);
    }
   public static void main(String args[]) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    rotateToleft(arr, n, k);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
     int[] arr1 = {1,2,3,4,5,6,7};
    int n1 = 7;
    int k1 = 2;
    rotateToRight(arr1, n1, k1);
    System.out.print("After Rotating the k elements to right ");
    for (int i = 0; i < n; i++)
      System.out.print(arr1[i] + " ");
    System.out.println();
  }
 }
