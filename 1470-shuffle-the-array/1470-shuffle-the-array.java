class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            k+=2;
        }
        int l=1;
        for(int i=n;i<nums.length;i++){
            ans[l]=nums[i];
            l+=2;
        }
        return ans;
    }
}