package problemsSolving.leetcode;

public class LongestCommanPrefix_14 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if(strs.length == 0 || strs == null){
                return "";
            }

            String prefixo = strs[0];

            for(int i = 1; i < strs.length; i++){
                while(!strs[i].startsWith(prefixo)){

                    prefixo = prefixo.substring(0, prefixo.length() - 1);

                    if (prefixo.isEmpty()){
                        return "";

                    }
                }
            }

            return prefixo;

        }
    }
}
