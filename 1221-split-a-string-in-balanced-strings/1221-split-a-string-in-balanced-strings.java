class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int b=0;
        for(char ch:s.toCharArray()){
            if(ch=='R'){
                b++;  
            } else {
                b--;
            }
            if(b==0){
                c++;
            }
        }
        return c;
    }
}