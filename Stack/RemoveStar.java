package Stack;
import java.util.*;
class RemoveStar {
    public String removeStars(String s) {
        if(s.length()==0  || s==null) return "";
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch!='*') {
                st.push(ch);
            }
            else {
                if(!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        if(st.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}