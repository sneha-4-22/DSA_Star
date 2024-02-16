package Arrays;
import java.util.*;

class findLeastNum {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        freqList.sort(Comparator.comparingInt(Map.Entry::getValue));

        int uniqueCount = freqList.size();
        for (Map.Entry<Integer, Integer> entry : freqList) {
            if (k >= entry.getValue()) {
                k -= entry.getValue();
                uniqueCount--;
            } else {
                break;
            }
        }

        return uniqueCount;
    }
}
