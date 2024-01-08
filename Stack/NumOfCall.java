package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfCall {
    private Queue<Integer> req;
    public NumOfCall() {
        this.req=new LinkedList<>();
    }
    
    public int ping(int t) {
        req.add(t);
        while(req.peek()<t-3000){
            req.poll();
        }return req.size();
    }
}
