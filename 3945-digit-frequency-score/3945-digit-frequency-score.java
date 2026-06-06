class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int ld=n%10;
            map.put(ld,map.getOrDefault(ld,0)+1);
            n/=10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            sum+=(entry.getValue()*entry.getKey());
        }
        return sum;
    }
}