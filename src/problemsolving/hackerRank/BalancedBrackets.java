package problemsSolving.hackerRank;

import java.util.ArrayDeque;

public class BalancedBrackets {

    public static String isBalanced(String s) {

        if(s.length() % 2 != 0){
            return "NO";
        }

        ArrayDeque<Character> stack = new ArrayDeque<>();


        for(int i = 0; i < s.length(); i++){
            char elemento = s.charAt(i);

            if(elemento == '{' || elemento == '[' || elemento == '('){
                stack.push(elemento);
            }else{
                if(stack.isEmpty()){
                    return "NO";
                }

                if((elemento == '}' && stack.peek() == '{' ) || (elemento == ']' && stack.peek() == '[') || (elemento == ')' && stack.peek() == '(')){
                    stack.pop();
                }else{
                    return "NO";
                }
            }

        }

        return stack.isEmpty() ? "YES" : "NO";

    }
}
