class Solution {
    public int largestAltitude(int[] gain) {
        int nums[] = new int[gain.length+1];
        nums[0] = 0;

        for(int j = 0;j<gain.length;j++){
            int sum = nums[j] + gain[j];
            nums[j+1] = sum;
        }

        int max = 0;

        for(int k=0;k<nums.length;k++){
            if(nums[k] > max){
                max = nums[k];
            }
        }
        return max;
    }
}