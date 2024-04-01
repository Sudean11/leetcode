import java.util.ArrayList;
import java.util.Arrays;

public class WordSearch {
    char[] charList;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        charList = word.toCharArray();
        this.board = board;
        return backtrack(new int[]{0,0}, charList[0], new ArrayList<>(), 0);
    }

    public ArrayList<int[]> getAllAvailablePositions(int[] currPos, ArrayList<int[]> excludedPositions){
        ArrayList<int[]> availablePos = new ArrayList<>();

        //checkTop
        if(currPos[0]-1 >= 0){
            if(!excludedPositions.contains(new int[]{currPos[0]-1, currPos[1]})){
                availablePos.add(new int[]{currPos[0]-1, currPos[1]});
            }
        }

        //checkLeft
        if(currPos[1]-1>=0){
            if(!excludedPositions.contains(new int[]{currPos[0], currPos[1]-1})){
                availablePos.add(new int[]{currPos[0], currPos[1]-1});
            }
            
        }

        //checkRight
        if(currPos[1]+1<board[currPos[0]].length){
            if(!excludedPositions.contains(new int[]{currPos[0], currPos[1]+1})){
                availablePos.add(new int[]{currPos[0], currPos[1]+1});
            }
        }
        //checkBottom
        if(currPos[0]+1<board.length){
            if(!excludedPositions.contains(new int[]{currPos[0]+1, currPos[1]})){
                availablePos.add(new int[]{currPos[0]+1, currPos[1]});
            }
        }

        for(int[] a: availablePos){
            System.out.println(board[a[0]][a[1]]);
        }

        return availablePos;
    }

    private boolean backtrack(int[] currentPos, char neededValue, ArrayList<int[]> excludedPositions, int indexOfNeededValue) {
        if(board[currentPos[0]][currentPos[1]] == neededValue ){
            ArrayList<int[]> availablePos = getAllAvailablePositions(currentPos, excludedPositions);
            indexOfNeededValue++;
            ArrayList<int[]> newExcludedPos = new ArrayList<>(excludedPositions);
            newExcludedPos.add(currentPos);
            for(int[] singlePos: availablePos){
                if(indexOfNeededValue == charList.length){
                    System.out.println("Hello");
                    return true;
                }
                System.out.println("backtrack started for " + charList[indexOfNeededValue]+ " "+Arrays.toString(singlePos));
                if(backtrack(singlePos, charList[indexOfNeededValue], newExcludedPos, indexOfNeededValue)){
                    return true;
                }
            }
        }
        System.out.println(board[currentPos[0]][currentPos[1]]);
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(new WordSearch().exist(board, "ABCCS"));
    }
}
