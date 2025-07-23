class RotateMatrixBy90Degree {
public static void rotate(int[][] matrix)
{ 
   //row
    int n = matrix.length;
        // Perform Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
}
public static void main(String args[]) {
int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
rotate(arr);
System.out.println("Rotated Image");
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr.length; j++) {
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
}
}
