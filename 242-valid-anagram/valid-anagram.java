class Solution {
    public boolean isAnagram(String s1, String s2) {
    HashMap<Character,Integer> map= new HashMap<>();
      int l1= s1.length();
      int l2= s2.length();
      if(l1!=l2)return false;
      for(int i=0;i<l1;i++){
          char ch=s1.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for(int i=0;i<l2;i++){
          char ch =s2.charAt(i);
          if(!map.containsKey(ch))return false;
          int freq=map.get(ch);
          if(freq==0)return false;
          map.put(ch,freq-1);
      }
      return true;
        
    }
}