class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0;
        for(int i=0;i<t.length();i++){
            s1+=t.charAt(i);
        }
        int s2=0;
        for(int i=0;i<s.length();i++){
            s2+=s.charAt(i);
        }
        return (char)(s1-s2);
    }
}