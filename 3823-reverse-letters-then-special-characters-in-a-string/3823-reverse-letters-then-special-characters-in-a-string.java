class Solution {
    public String reverseByType(String s) {
        StringBuilder letters=new StringBuilder();
        StringBuilder special=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                letters.append(ch);
            } else {
                special.append(ch);
            }
        }
        letters.reverse();
        special.reverse();
        int i=0;
        int j=0;
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                ans.append(letters.charAt(i++));
            } else {
                ans.append(special.charAt(j++));
            }
        }
        return ans.toString();
    }
}