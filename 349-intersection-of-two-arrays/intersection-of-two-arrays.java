class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1_set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for( int x : nums1){
            nums1_set.add(x);
        }
        for(int i=0;i<nums2.length;i++){
            if(nums1_set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int[] result = new int[ans.size()];
        int idx = 0;
        for(int num : ans){
            result[idx++] = num;
        }
        return result;
    }
}