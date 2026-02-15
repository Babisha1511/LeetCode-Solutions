class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int m=nums[0];
       int c=nums[0];
       int m1=nums[0];
       int c2=nums[0];
       for(int i=1;i<nums.length;i++){
          c=Math.max(nums[i],c+nums[i]);
          m=Math.max(m,c);
          c2=Math.min(nums[i],c2+nums[i]);
          m1=Math.min(c2,m1);
       }
       return Math.max(m,Math.abs(m1));
    }
}