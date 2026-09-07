class Solution {
    public boolean isPalindrome(int x) {
       int a=x;
       int rev=0;
       while(x>0){
        int ld=x%10;
        rev=rev*10+ld;
        x/=10;
       }
       return rev==a;
    }
    
}