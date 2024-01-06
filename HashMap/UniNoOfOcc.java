package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniNoOfOcc {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (int count : occurrenceMap.values()) {
            if (!uniqueOccurrences.add(count)) {
                return false; 
            }
        }
        return true;
    }
}
