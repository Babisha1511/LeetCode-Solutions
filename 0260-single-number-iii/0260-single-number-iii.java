class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int f:nums){
            freq.put(f,freq.getOrDefault(f,0)+1);
        }
        int k=0;
        for(int n:nums){
            if(freq.get(n)==1){
                ans[k++]=n;
            }
        }
        return ans;
    }
}