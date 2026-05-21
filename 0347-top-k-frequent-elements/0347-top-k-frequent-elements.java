class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
       list.sort((a,b)->b.getValue().compareTo(a.getValue()));
       int[] ans=new int[k];
       int i=0;
       for(Map.Entry<Integer,Integer> m:list){
        if(k-->0){
          ans[i++]=m.getKey();
        }
       }
       return ans;
    }
}