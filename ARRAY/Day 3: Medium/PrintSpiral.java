import java.util.*;
class PrintSpiral {
public static List<Integer> printSpiral(int[][] matrix)
{
List<Integer> ans=new ArrayList<>();
//row
int n=matrix.length;
//column
int m=matrix[0].length;
int top=0;
int bottom=n-1;
int left=0;
int right=m-1;
while(top<=bottom && left<=right)
{
// For moving left to right
for(int i=left;i<=right;i++)
ans.add(matrix[top][i]);
top++;
// For moving top to bottom.
for(int i=top;i<=bottom;i++)
ans.add(matrix[i][right]);
right--;
// For moving right to left.
if(top<=bottom)
{
for(int i=right;i>=left;i--)
ans.add(matrix[bottom][i]);
bottom--;
}
// For moving bottom to top.
if(left<=right)
{
for(int i=bottom;i>=top;i--)
ans.add(matrix[i][left]);
left++;
}
}
return ans;
}
public static void main(String[] args) {
//Matrix initialization.
int[][] mat = {{1, 2, 3, 4},
{5, 6, 7, 8},
{9, 10, 11, 12},
{13, 14, 15, 16}};
List<Integer> ans = printSpiral(mat);
for(int i = 0;i<ans.size();i++){
System.out.print(ans.get(i) + " ");
}
System.out.println();
}
}
