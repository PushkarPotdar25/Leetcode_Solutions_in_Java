class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int p = 0;
        while (p + 1 < n && nums[p + 1] > nums[p]) {
            p++;
        }
        if (p == 0) return false;

        int q = p;
        while (q + 1 < n && nums[q + 1] < nums[q]) {
            q++;
        }
        if (q == p) return false;
        if (q == n - 1) return false;

        for (int i = q + 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) return false;
        }

        return true;
    }
}
