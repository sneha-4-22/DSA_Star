package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;

public class MaxVowelsSubString {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int ans = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        ans = count;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
