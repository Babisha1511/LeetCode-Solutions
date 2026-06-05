class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==2){
                ans[0]=entry.getKey();
            }
        }
        int i=1;
        int j=nums.length;
        while(i<=j){
           if(map.containsKey(i)){
            i++;
           } else {
            ans[1]=i;
            break;
           }
        }
        return ans;
    }
}