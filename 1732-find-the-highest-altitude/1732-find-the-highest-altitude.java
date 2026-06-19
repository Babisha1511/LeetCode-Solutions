class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int curr=max;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            max=Math.max(max,curr);
        }
        return max;
    }
}