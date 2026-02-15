class Solution {
    public int maxProduct(int[] nums) {
        int m=nums[0];
        int c2=nums[0];
        int c=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int t=c;
                c=c2;
                c2=t;
            }
            c=Math.max(nums[i],c*nums[i]);
            c2=Math.min(nums[i],c2*nums[i]);
            m=Math.max(c,m);
        }
        return m;
    }
}