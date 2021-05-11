/*
 Abhi the smartest boy of IIIT-A is going for a long drive on the holy ocassion of Valentines Day with his GF and if he will drive for x hours then he will get h amount of happiness level. 
 Here h=a*x^k1 + b*x^k2 where a, b, k1, k1 are non negative integers. 
 Obviously , Abhi wants to be as much happy as possible but Sonu has became jealous from Abhi . That is why,  Sonu can't bear the happiness level of Abhi more than M. 
 As, Abhi is a gentle man and having a golden heart . So, he can't make Sonu angry due to his own happiness and finally he decided to drive only for that amount of hours which Sonu can bear. 
 Abhi asked to Kalyan for calculating the maximum amount of hours x ( an integer) such that he may enjoy Valentines Day without making Sonu angry. 
 But, Kalyan is busy in creating real life programming problems for you. 
 So, Kalyan assigned this task to you. 
 In every testcases you have given a, b, k1, k2 and M and you have to tell the maximum value of integer  such that Sonu shouldn't become angry with Abhi. 
 If the maximum value of x is greater than or equal to 10^5 then print "Love is immortal" otherwise print the maximum x. 
 */
package DSAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	long binary(long[] arr) {
		long low = 0;
		long high = (long) Math.pow(10, 18);
		long comp = 0;
		long res = -1;
		long mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			comp = (long) (arr[0] * Math.pow(mid, arr[2]) + arr[1] * Math.pow(mid, arr[3]));
			if (comp == arr[4]) {
				res = mid;
				return res;
			} else if (comp < arr[4]) {
				res = mid;
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution ob = new Solution();
		long[] a = new long[5];
		for (int i = 1; i <= num; i++) {
			String s[] = br.readLine().split(" ");
			for (int j = 0; j < 5; j++) {
				a[j] = Long.parseLong(s[j]);
			}
			if (ob.binary(a) >= Math.pow(10, 5))
			{
				System.out.println(ob.binary(a));
				System.out.println("Love is immortal");
			}
			else
				System.out.println(ob.binary(a));
		}
	}

}
