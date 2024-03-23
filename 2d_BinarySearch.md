# 2D Matrix Search Algorithms

## Linear Search. 

### steps 

- Define Function: The function search is defined, which takes two parameters: a 2D integer array mat representing the matrix, and an integer target representing the value to search for.

- Get Matrix Size: Obtain the size of the matrix by getting the length of the array mat, assuming it's a square matrix, so the number of rows would be equal to the number of columns (n).

- Check Matrix Size: If the size of the matrix n is equal to 0, return false, indicating that the matrix is empty and hence the target cannot be found.

- Traverse Matrix: Iterate through each row (i) and column (j) of the matrix using nested for loops.

- Check Element: For each element at position (i, j) in the matrix, compare it with the target value. If the element matches the target, return true, indicating that the target value has been found.

- Element Not Found: If the function completes the iteration through the entire matrix without finding the target value, return false, indicating that the target value is not present in the matrix.

```
public static boolean search(int[][] mat, int target){
        if (n == 0)
            return -1;
 
        // traverse through the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                // if the element is found
                if (mat[i][j] == target) {
                    return true;
                }
        }
        // is the element is not found
        return false;
}
```
- Time Complexity: O(N^2)
- Auxiliary Space: O(1), since no extra space has been taken


##  Binary Search 
/* steps 
- Set Indexes: Initialize two pointers i and j to start from the top-right corner of the matrix. i represents the row index, and j represents the column index.

- Search Element: Enter a loop where the condition checks if i is within the bounds of the rows (0 to n-1) and j is within the bounds of the columns (0 to n-1).

- Check Target: Within each iteration of the loop, check if the current element mat[i][j] is equal to the target value.
        - If the current element is equal to the target, return true, indicating that the target value has been found.
        - If the current element is greater than the target, it means that the target, if present, would be in the left part of the matrix. Therefore, decrement j to move leftwards in the matrix.
        - If the current element is less than the target, it means that the target, if present, would be in the bottom part of the matrix. Therefore, increment i to move downwards in the matrix.
Loop Termination: If the loop terminates without finding the target value (i.e., i goes out of bounds or j goes out of bounds), return false, indicating that the target value is not present in the matrix.

- Return Result: Return false if the target value is not found within the matrix.
*/

```
public static boolean search(int[][] mat, int n, int target){
 
        // set indexes for top right
        int i = 0, j = n - 1;
        
        // element
        while (i < n && j >= 0) {
            if (mat[i][j] == target) {
                return true;
            }
            if (mat[i][j] > target)
                j--;
            else // if mat[i][j] < target
                i++;
        }
        return false; 
}
```
- Time complexity is O(log(min(n, m))).
- Auxiliary space complexity is O(1).

