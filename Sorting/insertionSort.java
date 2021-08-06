/* Insertion Sort */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public void insertionSort(int arr[], int n) {
		for(int i=1;i<n;i++) {
			int value = arr[i];
			int idx = i;
			while(idx>0 && arr[idx-1] > value) {
				arr[idx]= arr[idx-1];
				idx--;
			}
			arr[idx] = value;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Solution obj = new Solution();
		obj.insertionSort(arr, num);
	}
}
