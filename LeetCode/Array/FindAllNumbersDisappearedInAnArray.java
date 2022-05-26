/* Question - Find All Numbers Disappeared in an Array */
/* 
  Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

*/

/* Solution */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] arr = new int[n + 1];
        
        for(int i = 0; i < n; i++){
            arr[nums[i]]++;
        }
        
        for(int i = 1; i < n + 1; i++){
            if (arr[i] == 0){
                ans.add(i);
            }
        }
        
        return ans;
    }
}