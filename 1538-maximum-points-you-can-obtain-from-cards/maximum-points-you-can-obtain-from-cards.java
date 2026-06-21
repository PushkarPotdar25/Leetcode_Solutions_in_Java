class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int right = cardPoints.length-1;
        int leftsum = 0;
        int rightsum = 0;
        int left = 0;
        int sum = 0;
        for(left=0;left<k;left++){
            leftsum += cardPoints[left];
        }
        sum = leftsum;
        for(int i=0;i<k;i++){
            left--;
            leftsum -= cardPoints[left];
            rightsum += cardPoints[right];
            right--;
            sum = Math.max(sum,leftsum+rightsum);
        }
        return sum;
    }
}