class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowAvg=0;
        for(int i=0;i<k;i++){
            windowAvg+=nums[i];
        }
        double maxAvg=(double)windowAvg/k;
        for(int i=k;i<nums.length;i++){
           windowAvg+=nums[i]-nums[i-k];
           maxAvg=Math.max(maxAvg,(double)windowAvg/k);
        }
        return maxAvg;
    }
}