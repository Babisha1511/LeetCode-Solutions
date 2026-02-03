class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String ch=sb.toString();
        int i=0;
        int j=ch.length()-1;
        while(i<j){
            if(ch.charAt(i)!=ch.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}