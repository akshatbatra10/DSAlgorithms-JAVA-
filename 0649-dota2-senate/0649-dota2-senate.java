class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length();

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.add(i);
            } else {
                dQueue.add(i);
            }
        }

        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            
            int rTurn = rQueue.poll();
            int dTurn = dQueue.poll();

            if (dTurn < rTurn) {
                dQueue.add(dTurn + n);
            } else {
                rQueue.add(rTurn + n);
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}