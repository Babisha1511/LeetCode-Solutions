class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int index=0;
        List<int[]> list=new ArrayList<>();
        while(index < intervals.length){
            int newStart=intervals[index][0];
            int currEnd=intervals[index][1];
            
            while(index < intervals.length-1 && currEnd>=intervals[index+1][0]){
                currEnd=Math.max(currEnd,intervals[index+1][1]);
                index++;
            }
            int newEnd=currEnd;
            list.add(new int[]{newStart,newEnd});
            index++;
        }
        int[][] ans=new int[list.size()][2];
        int ind=0;
        for(int[] arr:list){
            ans[ind++]=arr;
        }
        return ans;
    }
}