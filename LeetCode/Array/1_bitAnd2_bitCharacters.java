/* Question - 1-bit and 2-bit Characters */
/* 
  We have two special characters:
    The first character can be represented by one bit 0.
    The second character can be represented by two bits (10 or 11).
  Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
*/

/* Solution */

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        boolean temp[] = new boolean[n];
        for(int i = 0; i < n; i++){
            temp[i] = true;
            if (bits[i] == 1)
                i++;   
        }
        return temp[n - 1];
    }
}