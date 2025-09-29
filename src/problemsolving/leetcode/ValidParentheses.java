package problemsSolving.leetcode;

import java.util.ArrayDeque;

public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {

            ArrayDeque<Character> stack = new ArrayDeque<>();

            if(s.length() == 0){
                return true;
            }

            if(s.length() % 2 != 0){
                return false;
            }

            for(int i = 0; i < s.length(); i++){
                char elemento = s.charAt(i);

                if(elemento == '(' || elemento == '{' || elemento == '['){
                    stack.push(s.charAt(i));
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }

                    if(elemento == ')' && stack.peek() == '(' || elemento == '}' && stack.peek() == '{' || elemento == ']' && stack.peek() == '[' ){
                        stack.pop();
                    }else{
                        return false;
                    }

                }

            }

            return stack.isEmpty();
        }
    }
}
