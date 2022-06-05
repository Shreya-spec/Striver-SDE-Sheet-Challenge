import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int col = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i =0; i<rows;i++)
        {
            if(matrix[i][0] == 0) col = 0;
            for(int j =1;j<cols;j++)
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        for(int i =rows-1; i>=0; i--)
        {
            for(int j = cols -1;j>=1;j--)
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if(col == 0) matrix[i][0] = 0;
        }
    }

}
