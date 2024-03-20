package ARRAYS;
import java.util.*;

class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char c: tasks){
            freq[c-'A']++;
        }
        Arrays.sort(freq);
        int chunk=freq[25]-1;
        int idle=chunk*n;
        for(int i=24;i>=0;i--){
            idle-=Math.min(chunk,freq[i]);
        }return idle<0?tasks.length:tasks.length+idle;
    }
}
