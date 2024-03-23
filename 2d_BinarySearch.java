
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
