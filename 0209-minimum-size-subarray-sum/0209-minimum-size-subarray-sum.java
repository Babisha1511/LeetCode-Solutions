class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int currSum=0;
        int minLength=Integer.MAX_VALUE;
        while(j<nums.length){
            currSum+=nums[j];
            while(currSum>=target){
                minLength=Math.min(minLength,j-i+1);
                currSum-=nums[i];
                i++;
            }
            j++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
