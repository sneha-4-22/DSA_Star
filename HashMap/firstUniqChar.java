package HashMap;

import java.util.HashMap;

/**
 * firstUniqChar
 */
public class firstUniqChar {

    public int UniqChar(String s) {
        HashMap<Character,Integer> res = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
        }     
        for (int i=0;i<s.length();i++) {
            if (res.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}