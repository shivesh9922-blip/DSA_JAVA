import java.util.*;
class FindUnion {
public static ArrayList<Integer> findUnion(int[] arr1,int[] arr2)
{
int n=arr1.length;
int m=arr2.length;
HashSet<Integer> s=new HashSet<>();
ArrayList<Integer> alist=new ArrayList<>();
for(int i=0;i<n;i++)
{
s.add(arr1[i]);
}
for(int i=0;i<m;i++)
{
s.add(arr2[i]);
}
for(int i:s)
{
alist.add(i);
}
return alist;
}
public static void main(String args[]) {
int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int arr2[] = {2, 3, 4, 4, 5, 11, 12};
ArrayList<Integer> Union = findUnion(arr1, arr2);
System.out.println("Union of arr1 and arr2 is ");
for (int val: Union)
System.out.print(val+" ");
}
}
