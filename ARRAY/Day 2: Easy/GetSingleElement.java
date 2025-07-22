class GetSingleElement {
public static int getSingleElement(int[] nums)
{
int xor=0;
for(int i=0;i<nums.length;i++)
{
xor=xor^nums[i];
}
return xor;
}
public static void main(String args[]) {
int[] arr = {4, 1, 2, 1, 2};
int ans = getSingleElement(arr);
System.out.println("The single element is: " + ans);
}
}
