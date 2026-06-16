class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
       Collections.sort(list,(a,b)->{
        if(b.getValue().equals(a.getValue())){
            return b.getKey()-a.getKey();
        }
        return b.getValue()-a.getValue();
       });
       int[] ans=new int[k];
       int j=0;
       for(Map.Entry<Integer,Integer> entry:list){
        if(k-->0){
          ans[j++]=entry.getKey();
        }
       }
       return ans;
    }
}