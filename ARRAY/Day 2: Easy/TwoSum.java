import java.util.*;
class TwoSum {
public static int[] twoSum(int[] nums,int target)
{
Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
int targetNum=target-nums[i];
if(map.containsKey(targetNum))
{
return new int[] {map.get(targetNum), i};
}
else
map.put(nums[i],i);
}
return new int[] {};
}
public static void main(String[] args) {
int[] nums={1,2,3,4,5,6,9};
int target=10;
System.out.println(Arrays.toString(twoSum(nums,target)));
}
}
