//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int minr = 0;
        int minc = 0;
        int maxr = r - 1;
        int maxc = c - 1;
        int count = 0;
        while (minr <= maxr && minc <= maxc) {
            for (int i = minc; i <= maxc && count < r * c; i++) {
                ans.add(matrix[minr][i]);
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count < r * c; i++) {
                ans.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count < r * c; i--) {
                ans.add(matrix[maxr][i]);
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < r * c; i--) {
                ans.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return ans;
    }
}
