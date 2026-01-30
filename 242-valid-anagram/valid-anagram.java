class Solution {
    public boolean isAnagram(String s1, String s2) {
         int l1= s1.length();
     int l2=s2.length();
     if(l1!=l2){
         return false;
     }
        HashMap<Character,Integer> map1=new HashMap<>();
     for(int i=0;i<l1;i++){
         char ch = s1.charAt(i);
         if(map1.containsKey(ch)){
             int freq= map1.get(ch);
             map1.put(ch,freq+1);
         }
         else{
             map1.put(ch,1);
         }
     }
     HashMap<Character,Integer> map2= new HashMap<>();
     for(int i=0;i<l2;i++){
         char ch = s2.charAt(i);
         if(!map1.containsKey(ch))return false;

         if(map2.containsKey(ch)){
             int freq= map2.get(ch);
             map2.put(ch,freq+1);
         }
         else{
             map2.put(ch,1);
         }
     }
      for( char ch : map2.keySet()){
          int freq1= map1.get(ch);
          int freq2= map2.get(ch);
          if(freq2< freq1){
              return false;
          }
      }
      return true;
    }
}