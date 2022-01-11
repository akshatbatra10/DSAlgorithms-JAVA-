/* Get all the subsequence of a string using recusion.

  Example: For String = "abc"
	   output = ["", "a", "b", "ab", "c", "ac", "bc", "abc"]

*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSS("abc"));
    }

    public static ArrayList<String> getSS(String s) {
        if (s.length() == 0) {
            ArrayList<String> baseString = new ArrayList<>();
            baseString.add("");
            return baseString;
        }
        char ch = s.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> prevResult = getSS(s.substring(1));
        for (int i = 0; i < prevResult.size(); i++) {
            result.add(prevResult.get(i));
            result.add(ch + prevResult.get(i));
        }
        return result;
    }
}