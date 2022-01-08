/* Bubble Sort using recursion */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void bubbleSort(int[] arr, int idx, int li) {
        	if (idx >= li) {
         	   	return;
        	}
        	if (arr[idx] > arr[idx + 1]) {
            		int temp = arr[idx];
            		arr[idx] = arr[idx+1];
            		arr[idx + 1] = temp;
        	}
        	bubbleSort(arr, idx + 1, li);
        	bubbleSort(arr, 0, li - 1);
    	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bubbleSort(arr, 0, arr.length - 1);
	}
}
