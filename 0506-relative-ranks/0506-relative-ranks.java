class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans=new String[score.length];
        int[] sorted=score.clone();
        Arrays.sort(sorted);
        for(int i=0;i<score.length;i++){
            if(sorted[score.length-1]==score[i]){
                ans[i]="Gold Medal";
            } else if(sorted[score.length-2]==score[i]){
                ans[i]="Silver Medal";
            } else if(sorted[score.length-3]==score[i]){
                ans[i]="Bronze Medal";
            } else {
                for(int j=0;j<score.length;j++){
                    if(score[i]==sorted[j]){
                        ans[i]=String.valueOf(score.length-j);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}