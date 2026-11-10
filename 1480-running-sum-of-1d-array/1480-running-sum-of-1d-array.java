class Solution {
    public int[] runningSum(int[] nums) {
       int sum=0;
       int j=0;
       for(int i=0;i<nums.length;i++){
        nums[j]=nums[i]+sum;
        sum=nums[j];
        j++;
       }
       return nums;
    }
}