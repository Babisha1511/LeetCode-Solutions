class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
        nums[0]=0;
        if(n>=1){
        nums[1]=1;
        }
        int i=1;
        while(2*i+1<=n){
          nums[2*i]=nums[i];
          nums[2*i+1]=nums[i]+nums[i+1];
          i++;
        }
        int m=0;
        for(int j=0;j<nums.length;j++){
           m=Math.max(m,nums[j]);
        }
        return m;
    }
}