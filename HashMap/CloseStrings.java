package HashMap;

import java.util.*;
import java.util.stream.Collectors;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for(char ch:word1.toCharArray()){
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }
        for(char ch:word2.toCharArray()){
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }
         if (!freq1.keySet().equals(freq2.keySet())) {
            return false;
        }
       return freq1.values().stream().sorted().collect(Collectors.toList())
                .equals(freq2.values().stream().sorted().collect(Collectors.toList()));
    
    }
}
