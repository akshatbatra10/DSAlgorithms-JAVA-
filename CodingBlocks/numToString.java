/*
  Find all possible combination of a String representation of a number.
  Taking 1 = 'A', 2 = 'B',..., 26 = 'Z'

  example- Input: 123
           Output: "ABC", "AW", "LC"

  Class Solution {

  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        numToString(num, "");
    }

  public static void numToString(int n, String ans) {
        if (n <= 0) {
            System.out.println(ans);
            return;
        }
        numToString(n / 10, (char)((n % 10) + 64) + ans);
        if (n % 100 > 0 && n % 100 <= 26 && n > 9) {
            numToString(n / 100, (char)((n % 100) + 64) + ans);
        }
    }

  }