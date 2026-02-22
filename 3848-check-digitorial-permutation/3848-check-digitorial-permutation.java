class Solution {
    public boolean isDigitorialPermutation(int n) {
        int org=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=factorial(ld);
            n/=10;
        }
        int[] freq1=new int[10];
        int[] freq2=new int[10];
        while(org>0){
            int ld1=org%10;
            freq1[ld1]++;
            org/=10;
        }
        while(sum>0){
            int ld1=sum%10;
            freq2[ld1]++;
            sum/=10;
        }

        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;

    }
    private int factorial(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }
}