class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}