/* Merge Sort */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public void merge(int[] l, int r[], int[] a) {
		int i=0,j=0,k=0;
		while(i<l.length && j<r.length) {
			if(l[i]<=r[j]) {
				a[k] = l[i];
				i++;
				k++;
			}
			else {
				a[k]=r[j];
				j++;
				k++;
			}
		}
		while(i<l.length) {
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<r.length) {
			a[k] = r[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int arr[], int n) {
		if(n<2)
			return;
		int mid = n/2;
		int left[] = new int [mid];
		int right[] = new int [n-mid];
		for(int i =0;i<mid;i++) {
			left[i] = arr[i];
		}
		for(int i=mid;i<n;i++) {
			right[i-mid] = arr[i];
		}
		mergeSort(left, mid);
		mergeSort(right, n-mid);
		merge(left,right,arr);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Solution obj = new Solution();
		obj.mergeSort(arr, num);
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
