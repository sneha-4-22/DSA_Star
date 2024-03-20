package HashMap;

import java.util.HashMap;

public class EqualRowCol {
    public int equalPairs(int[][] a) {
        HashMap<String,Integer> h=new HashMap<>();
        int n=a.length;
        String x="";
        for(int i=0;i<n;i++){
            x="";
            for(int j=0;j<n;j++){
                x+=a[i][j]+"+";
            }
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            x="";
            for(int j=0;j<n;j++){
                x+=a[j][i]+"+";
            }
            if(h.containsKey(x)){
                count+=h.get(x);
            } 
        }
        return count;
    }
}
