import java.util.*;
class SearchMatrix {
public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target)
{//Row
int n=matrix.size();
//Coulumn
int m=matrix.get(0).size();
int low=0;
int high=n*m-1;
while(low<=high)
{
int mid=(low+high)/2;
//row=mid/column
int row=mid/m;
//col=mid%column
int col=mid%m;
if(matrix.get(row).get(col)==target)
{
return true;
}
else if(matrix.get(row).get(col)<target)
{
low=mid+1;
}
else
high=mid-1;
}
return false;
}
public static void main(String[] args) {
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
boolean result = searchMatrix(matrix, 8);
System.out.println(result ? "true" : "false");
}
}
