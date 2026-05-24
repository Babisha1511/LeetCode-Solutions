class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<=k){
                list.add(nums[i]);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int a:list){
            ans[i++]=a;
        }
        return ans;
    }
}