package Stack;

import java.util.Stack;

public class AsteroidCollision {
     public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int val:asteroids){
            if(st.isEmpty()||val>0){
                st.push(val);
            }
            else{
                while(true){
                    int peek=st.peek();
                    if(peek<0){
                        st.push(val);
                        break;
                    }
                    else if(peek==-val){
                        st.pop();
                        break;
                    }
                    else if(peek>-val) break;
                    else{
                        st.pop();
                        if(st.isEmpty()){st.push(val);
                        break;
                        }
                    }
                }
            }
        }
        int i=st.size();
        int ans[]=new int[i];
        while(!st.isEmpty()){
            if(i>0)
            ans[i-1]=st.pop();
            i--;
        }return ans;
    }
}
