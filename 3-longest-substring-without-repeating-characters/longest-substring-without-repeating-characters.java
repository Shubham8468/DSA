class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        List<Character> l= new ArrayList<>();
        int end=0, min =0, maxlen=0;
        while (end<s.length()){
            char ch=s.charAt(end);
            if(!l.contains(ch)){
                int len=l.size();
                l.add(ch);
                end++;
                maxlen=Math.max(len,maxlen);
            }
            else{
                l.remove(Character.valueOf(s.charAt(min)));
                min++;
            }
        }
       return maxlen+1;
    }
}