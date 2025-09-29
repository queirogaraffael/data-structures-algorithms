package problemsSolving.leetcode;

public class ReverseInteger {
    class Solution {
        public int reverse(int x) {
            StringBuilder sb = new StringBuilder();
            sb.append(Math.abs(x)).reverse();

            try {
                int reversed = Integer.parseInt(sb.toString());
                return x < 0 ? -reversed : reversed;
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

}