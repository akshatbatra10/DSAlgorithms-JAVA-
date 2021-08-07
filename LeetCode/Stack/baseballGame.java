/*
 You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

 At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

 An integer x - Record a new score of x.
 "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
 "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
 "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.

 Return the sum of all the scores on the record.
*/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> points = new Stack<>();
        for(int i = 0;i < ops.length;i++) {
            switch(ops[i]) {
                case "C":
                    points.pop();
                    break;
                case "D":
                    points.push(2 * points.peek());
                    break;
                case "+":
                    int temp1 = points.pop();
                    int temp2 = points.pop();
                    points.push(temp2);
                    points.push(temp1);
                    points.push(temp1 + temp2);
                    break;
                default :
                    points.push(Integer.parseInt(ops[i]));
                    break;
            }
        }
        int sum = 0;
        while(points.empty() == false) {
            sum = sum + points.pop();
        }
        return sum;
    }
}