//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int val = find(arr[i], 0, m - 1);
            if (val > max) {
                max = val;
                ans = i;
            }
        }
        return ans;
    }
    public int find(int[] arr, int i, int j) {
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == 1) {
                j  = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return arr.length - j - 1;
    }
}