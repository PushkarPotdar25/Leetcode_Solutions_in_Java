class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int zeroes = 0;

        while(right < nums.length){
            int num = nums[right];
        
            if(num == 0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[left] == 0) zeroes--;
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}