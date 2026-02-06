class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=0;
        int low=0;
        int high=n-1;
        while(low<high){
          int res=Math.min(height[low],height[high])*(high-low);
          ans=Math.max(ans,res);
          if(height[low]<height[high]){
            low+=1;
          } else {
            high-=1;
          }
        }
        return ans;
    }
}