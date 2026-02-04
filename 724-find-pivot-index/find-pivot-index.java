class Solution {
    public int pivotIndex(int[] nums) {
        int indx = 0;
        while(indx < nums.length){
            int rightsum = 0;
            int leftsum = 0;
            for(int i=0;i<indx;i++){
                leftsum += nums[i];
            }
            for(int j=indx+1;j<nums.length;j++){
                rightsum += nums[j];
            }
            if(rightsum == leftsum){
                return indx;
            }
            indx++;
        }
        return -1;
    }
}