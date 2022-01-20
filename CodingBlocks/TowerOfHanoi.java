/*  Tower of Hanoi  */

  Class Solution {
      
      public static void main(String[] args) throws IOException {
          hanoi(4, 'A', 'B', 'C');
      }

      public static void hanoi(int n, char from_peg, char to_peg, char help_peg) {
          if (n == 1) {
              System.out.println("Moving ring " + n + " from " + from_peg + " to " + to_peg);
              return;
          }
          hanoi(n -1, from_peg, help_peg, to_peg);
          System.out.println("Moving ring " + n + " from " + from_peg + " to " + to_peg);
          hanoi(n-1, help_peg, to_peg, from_peg);
      }
  }