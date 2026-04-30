class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            int[] freq=new int[26];
            for(char c:str.toCharArray()){
                freq[c-'a']++;
            }
                if(map.isEmpty()){
                    for(int j=0;j<freq.length;j++){
                    if(freq[j]!=0){
                    map.put((char)(j +'a'),freq[j]);
                }
                }
                } else{
                    for(int j=0;j<freq.length;j++){
                    int f=map.getOrDefault((char)(j + 'a'),0);
                    map.put((char)(j+'a'),Math.min(freq[j],f));
                }
            }
        }
        List<String> res=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>0){ 
                String res1=String.valueOf(entry.getKey()); 
            int val=entry.getValue(); 
            while(val -- >0){
                res.add(res1);
             }
            }
       }
        return res;
    }
}