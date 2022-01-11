/* Get all the permutation of a string using recusion.

  Example: For String = "abc"
	   output = ["abc", "bca", "bac", "acb", "cab", "cba"]

*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(getPer("abc"));
    }

    public static ArrayList<String> getPer(String s) {
        if (s.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = s.charAt(0);
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = getPer(s.substring(1));
        for (int i = 0; i < rr.size(); i++) {
            String str = rr.get(i);
            for (int j = 0; j <= str.length(); j++) {
                mr.add(str.substring(0, j) + ch + str.substring(j));
            }
        }
        return mr;
    }
}