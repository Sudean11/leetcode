package mwa.ArrayAndHash;

import java.util.HashMap;

public class ValidSudoku {

    ValidSudoku(){
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        if(!checkHorizontalAndVertical(board)){
            return false;
        };
        checkBoxes(board);
        return true;
    }

    private Boolean checkBoxes(char[][] board) {



        return true;
    }

    private boolean checkHorizontalAndVertical(char[][] board) {

        HashMap<Character, Boolean> horizontal = new HashMap<>();
        HashMap<Character, Boolean> vertical = new HashMap<>();

        for(int i = 0; i<9; i++){
            horizontal.clear();
            vertical.clear();
            for(int j=0; j<9; j++){
                if(horizontal.get(board[i][j]) != null){
                    return false;
                }
                if(vertical.get(board[j][i]) != null){
                    return false;
                }
                if(board[i][j]!='.'){
                    horizontal.put(board[i][j], true);
                }
                if(board[j][i]!='.'){
                    vertical.put(board[j][i], true);
                }

                
            }
        }
        return true;
    }


    public static void main(String[] args) {
        new ValidSudoku();
    }
}
