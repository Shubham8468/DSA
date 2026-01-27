class Solution {
    public boolean isAnagram(String s1, String s2) {
        int s1l=s1.length();
        int s2l=s2.length();
        if(s1l!=s2l)return false;
        HashMap<Character,Integer> map1= new HashMap<>();
        for(int i=0;i< s1.length();i++){
            char ch = s1.charAt(i);
            if(map1.containsKey(ch)){
                int freq= map1.get(ch);
                map1.put(ch,freq+1);
            }
            else{
                map1.put(ch,1);
            }
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i< s2.length();i++){
            char ch= s2.charAt(i);
            if(!map1.containsKey(ch)){
                return false;
            }
            if(map2.containsKey(ch)){
                int freq=map2.get(ch);
                map2.put(ch,freq+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        for(char ch : map2.keySet()){
            int freq1=map1.get(ch);
            int freq2=map2.get(ch);
            if(freq1!=freq2){
                return false;
            }
        }
        return true; 
    }
}