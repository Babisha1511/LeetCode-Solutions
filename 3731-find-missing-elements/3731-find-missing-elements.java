class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> a=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!set.contains(i)){
              a.add(i);
            }
        }
        return a;
    }
}