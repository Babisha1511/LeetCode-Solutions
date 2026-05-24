class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();
        HashSet<Character> digit=new HashSet<>();
        HashSet<Character> special=new HashSet<>();
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>='a' && password.charAt(i)<='z'){
                lower.add(password.charAt(i));
            } else if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                upper.add(password.charAt(i));
            } else if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                digit.add(password.charAt(i));
            } else {
                special.add(password.charAt(i));
            }
        }
        return lower.size()*1 + upper.size()*2 + digit.size()*3 + special.size()*5;
    } 
}