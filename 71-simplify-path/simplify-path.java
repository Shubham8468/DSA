class Solution {
    public String simplifyPath(String path) {
    String[] arr= path.split("/");
    Stack<String> st=new Stack<>();
    for(String i : arr){
        if(i.equals("..")&& !st.empty()){
            st.pop();
        }
        else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
            st.push(i);
        }

    } 
    StringBuilder sb=new StringBuilder();
    for(String  i : st){
        sb.append("/");
        sb.append(i);
    }
    return sb.length()==0 ? "/" : sb.toString();

        
    }
}