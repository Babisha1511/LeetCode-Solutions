class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c=0;
        int[] freq=new int[A.length+1];
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2) c++;
             freq[B[i]]++;
            if(freq[B[i]]==2) c++;
            ans[i]=c;
        }
        return ans;
    }
}