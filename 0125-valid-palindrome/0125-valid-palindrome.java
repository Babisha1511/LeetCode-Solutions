class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        int l=0;
        int h=sb.length()-1;
        while(l<h){
            if(sb.charAt(l)!=sb.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}