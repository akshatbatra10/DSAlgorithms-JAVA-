/* 

  Get Board Path is a method that tells us number of way to reach a number(eg.10) starting from any number,
  less than the number to be reached (eg.0) by rolling a dice.

*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBoardPath(0, 10));
    }

    public static ArrayList<String> getBoardPath(int curr, int end) {

        if (curr == end) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (curr > end) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            ArrayList<String> rr = getBoardPath(curr + dice, end);

            for (String rrs : rr) {
                mr.add(dice + rrs);
            }
        }
        return mr;
    }
}