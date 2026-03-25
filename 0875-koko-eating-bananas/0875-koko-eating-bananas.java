class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=0;
       for(int i=0;i<piles.length;i++){
         high=Math.max(high,piles[i]);
       }
       while(low<high){
          int mid=(low+high)/2;
          int total=0;
          for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/mid);
          }
          if(total>h){
              low=mid+1;
          } else {
              high=mid;
          }
       }
       return low;
    }
}