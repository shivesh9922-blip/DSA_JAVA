class RearrangebySign {
    public static int[] reArrangeBySign(int[] nums) {
          int[] rearrangedArray = new int[nums.length];
        int positiveIndex = 0, negativeIndex = 1;
        for (int num : nums) {
            if (num > 0) {
              rearrangedArray[positiveIndex] = num;
                positiveIndex += 2; 
            } else {
               rearrangedArray[negativeIndex] = num;
                negativeIndex += 2; 
            }
        }
        return rearrangedArray;
    }
    public static void main(String[] args) {
int[] nums={3,1,-2,-5,2,-4};
int[] ans = reArrangeBySign(nums);
for (int i = 0; i < ans.length; i++)
{
    System.out.print(ans[i] + " ");
      }
}
}
