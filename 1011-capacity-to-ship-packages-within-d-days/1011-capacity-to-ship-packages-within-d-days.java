class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(weights[i],low);
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(cap(weights,days,mid)){
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return low;
    }
    private boolean cap(int[] weights,int days,int c){
        int mdays=1;
        int load=0;
           for(int w:weights){
            if(load+w <= c){
                load+=w;
            } else {
                mdays++;
                load=w;
            }
        }
        return mdays<=days;
    }
}