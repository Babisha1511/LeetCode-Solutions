class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0 && j<nums.length){
                ans[j]=nums[i];
                j+=2;
            }
        }
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 != 0 && k<nums.length){
                ans[k]=nums[i];
                k+=2;
            }
        }
        return ans;
    }
}