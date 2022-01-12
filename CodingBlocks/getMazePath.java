/* 

  Get Maze Path is a method that gives us number of possible ways to reach the end of matrix from (0,0).
  H - 1 step Horizontal
  V - 1 step Vertical

*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(getMazePath(0, 0, 2, 2));
    }

    public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> bs = new ArrayList<>();
            return bs;
        }
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getMazePath(cr, cc + 1, er, ec);
        for (String rrhs : rrh) {
            mr.add("H" + rrhs);
        }
        ArrayList<String> rrv = getMazePath(cr + 1, cc, er, ec);
        for (String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        return mr;
    }
}