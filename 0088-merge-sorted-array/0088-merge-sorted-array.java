class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       List<Integer> list=new ArrayList<>();
       int i=0;
       int j=0;
       while(i<m && j<n){
        list.add(nums1[i]);
        i++;
        list.add(nums2[j]);
        j++;
       }
       while(i<m){
        list.add(nums1[i++]);
       }
       while(j<n){
        list.add(nums2[j++]);
       }
       int k=0;
       for(int p:list){
        nums1[k++]=p;
       }
       Arrays.sort(nums1);
    }
}