class Solution {
    public int lengthOfLastWord(String s) {
        String[] strings=s.split(" ");
        int n=strings.length;
        String ans=strings[n-1];
        return ans.length();
    }
}