class FreqPair {
    int freq;
    char ch;
    FreqPair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[123];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        
        ArrayList<FreqPair> fp = new ArrayList<>();
        for (int i = 48; i < 123; i++) {
            if (freq[i] != 0) {
                fp.add(new FreqPair(freq[i], (char) (i)));
            }
        }
        
        Collections.sort(fp, new Comparator<FreqPair>() {
            public int compare(FreqPair fp1, FreqPair fp2) {
                return fp2.freq - fp1.freq;
            }
        });
        
        StringBuilder ans = new StringBuilder();
        for (FreqPair pair : fp) {
            int len = pair.freq;
            char c = pair.ch;
            for (int i = 0; i < len; i++) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}