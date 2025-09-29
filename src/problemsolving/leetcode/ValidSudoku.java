package problemsSolving.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            Set<String> seen = new HashSet<>();

            for(int i = 0; i < 9 ;i++){
                for(int j = 0; j < 9; j++){
                    char elemento = board[i][j];
                    if(elemento != '.'){
                        String linha = "Linha: " + i + " - " + elemento;
                        String coluna = "Coluna: " + j + " - " + elemento;
                        String box = "Box: " + (i/3) + (j/3) + " - " + elemento;

                        if(!seen.add(linha) || !seen.add(coluna) || !seen.add(box)){
                            return false;
                        }

                    }

                }
            }
            return true;
        }
    }
}
