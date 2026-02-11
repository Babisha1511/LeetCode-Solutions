class Solution {
    public int getLeastFrequentDigit(int n) {
        List<Integer> a=new ArrayList<>();
        while(n>0){
            int ld=n%10;
            a.add(ld);
            n/=10;
        }
        int[] freq=new int[10];
        for(int b:a){
           freq[b]++;
        }
        int min=Integer.MAX_VALUE;
        int res=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 && freq[i]<min){
                min=freq[i];
                res=i;
            }
        }
        return res;
    }
}