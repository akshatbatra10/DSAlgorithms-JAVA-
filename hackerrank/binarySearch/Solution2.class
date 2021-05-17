/* Two people, Alice and Bob are playing a game. They have infinite gems. Alice starts the game and puts A[1] gems in a stack.
Then Bob adds A[2] gems to the stack. Alice continues by adding A[3] gems , Bob adding A[4] gems and so on. Carrey, their good friend, 
enters and choose Xth gem from top of stack  and then guesses whose gem (Alice or Bob) it is. He does this exactly Q times. 
Carrey is very smart and guesses all the time correctly. Output his each guess.
*/

package DSAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		int a[] = new int[num];
		long[] key = new long[num];
		for (int i = 0; i < num; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		key[0] = a[0];
		long sum = a[0];
		for (int i = 1; i < num; i++) {
			sum = sum + a[i];
			key[i] = sum;
		}
		int q = Integer.parseInt(br.readLine());
		for (int i = 1; i <= q; i++) {
			int x = Integer.parseInt(br.readLine());
			long y = key[num-1]-x;
			int low = 0;
			int high = num - 1;
			int mid, res = 0;
			while (low <= high) {
				mid = low + (high - low) / 2;
				if (key[mid] == y) {
					res = mid+1;
					break;
				} else if (key[mid] > y) {
					res = mid;
					high = mid - 1;
				} else
					low = mid + 1;
			}
			if ((res + 1) % 2 == 0)
				System.out.println("Bob");
			else
				System.out.println("Alice");
		}
	}

}
