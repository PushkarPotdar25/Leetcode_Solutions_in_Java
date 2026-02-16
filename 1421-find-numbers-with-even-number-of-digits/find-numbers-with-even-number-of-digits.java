class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; 
            int cnt2 = 0;
            while (num > 0) {
                num /= 10;
                cnt2++;
            }
            if (cnt2 % 2 == 0) {  
                cnt++;
            }
        }
        return cnt;
    }
}
