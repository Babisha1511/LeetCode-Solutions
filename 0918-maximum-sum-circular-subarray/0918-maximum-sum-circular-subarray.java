class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int currsum1=nums[0];
       int currsum2=nums[0];
       int n=nums.length;
       int total=0;
       for(int i=1;i<n;i++){
        currsum1=Math.max(nums[i],currsum1+nums[i]);
        max=Math.max(currsum1,max);        
        currsum2=Math.min(nums[i],currsum2+nums[i]);
        min=Math.min(currsum2,min);
       }
       for(int j=0;j<n;j++){
        total+=nums[j];
       }
       if(max<0){
        return max;
       }
       return Math.max(max,total-min);
    }
}