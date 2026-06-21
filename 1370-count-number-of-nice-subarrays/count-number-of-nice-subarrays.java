import java.util.*;

class Solution {

    private int atmost(int[] nums,int oddno){
        int left = 0;
        int oddcnt = 0;
        int count = 0;

        for(int right = 0;right < nums.length;right++){
            if(nums[right] % 2 == 1) oddcnt++;

            while(oddcnt > oddno){
                if(nums[left] % 2 == 1) oddcnt--;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
}