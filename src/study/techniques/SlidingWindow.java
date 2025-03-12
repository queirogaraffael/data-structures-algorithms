package study.techniques;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public int maximumLengthSubstring(String s) {
        int l = 0, r = 0, maxLen = 1;
        Map<Character, Integer> counter = new HashMap<>();

        counter.put(s.charAt(0), 1);

        while (r < s.length() - 1) {
            r++;
            counter.put(s.charAt(r), counter.getOrDefault(s.charAt(r), 0) + 1);

            while (counter.get(s.charAt(r)) == 3) {
                counter.put(s.charAt(l), counter.get(s.charAt(l)) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        SlidingWindow sol = new SlidingWindow();
        String s = "abcabcbb";
        System.out.println("Comprimento máximo do substring: " + sol.maximumLengthSubstring(s));
    }
}
