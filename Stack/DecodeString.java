package Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> counts =new Stack<>();
        Stack<StringBuilder> rs=new Stack<>();
        rs.push(new StringBuilder());
        int k=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+ch-'0';
            }else if(ch=='['){
                counts.push(k);
                rs.push(new StringBuilder());
                k=0;
            }else if(ch==']'){
                StringBuilder temp=rs.pop();
                int count=counts.pop();
                for(int i=0;i<count;i++){
                    rs.peek().append(temp);
                }
            }else{
                rs.peek().append(ch);
            }
        } return rs.pop().toString();
    }
}
