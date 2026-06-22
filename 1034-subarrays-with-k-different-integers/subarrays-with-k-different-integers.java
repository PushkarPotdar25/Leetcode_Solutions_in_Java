import java.util.*;

class Solution {

    private int atmost(int[] nums, int k) {
        if (k < 0) return 0;
        int left = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                int lft = nums[left];
                map.put(lft, map.get(lft) - 1);
                if (map.get(lft) == 0) {
                    map.remove(lft);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }
}