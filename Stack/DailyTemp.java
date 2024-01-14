package Stack;

import java.util.Stack;

public class DailyTemp {
    class Pair{
        int temp;
        int ans;
        Pair(int temp,int ans){
            this.ans=ans;
            this.temp=temp;
    }
}
    public int[] dailyTemperatures(int[] temperatures) {
    int[] ans=new int[temperatures.length];
    Stack<Pair> s=new Stack<>();
    s.push(new Pair(temperatures[temperatures.length-1],0));
    for (int i = temperatures.length - 2; i >= 0; i--) {
            int count = 1;
            while (!s.isEmpty() && s.peek().temp <= temperatures[i]) {
                count += s.peek().ans; 
                s.pop();
            }
            if (s.isEmpty()) { 
                s.push(new Pair(temperatures[i], 0));
            } else { 
                ans[i] = count; 
                s.push(new Pair(temperatures[i], count)); 
            }
        }
        return ans; 
    }
}
