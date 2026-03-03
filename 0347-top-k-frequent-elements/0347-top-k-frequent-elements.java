class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],0);
            }
                count.put(nums[i],count.get(nums[i])+1);
        }
        Map<Integer,List<Integer>> revcount=new HashMap<>();
        for(int num:count.keySet()){
            if(!revcount.containsKey(count.get(num))){
                revcount.put(count.get(num),new ArrayList<>());
            }
            revcount.get(count.get(num)).add(num);
        }
        int[] result=new int[k];
        int in=0;
        for(int i=nums.length;i>=1;i--){
            if(revcount.containsKey(i)){
                for(int n:revcount.get(i)){
                    if(in<k){
                        result[in++]=n;
                    } else {
                        break;
                    }
                }
            }
            if(in>=k){
                break;
            }
        }
        return result;
    }
}