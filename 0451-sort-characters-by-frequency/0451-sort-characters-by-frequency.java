class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            int a=entry.getValue();
            while(a-- > 0){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}