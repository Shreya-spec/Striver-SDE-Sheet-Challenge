import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();

        ArrayList<Long> row, pre = null;

       for(int i=0;i<n;i++){

         row = new ArrayList<>();

    for(int j=0;j<=i;j++){

                 if(j==0|| j==i)

                      row.add(1L);

                     else

                      row.add(pre.get(j-1)+pre.get(j));

                }

           pre = row;

            res.add(row);

       }

       return res;
	}
}
