import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Nqueen {

    ArrayList<int[]> arrayList = new ArrayList<>();

    Nqueen(){
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int[] pair = {i, j};
                arrayList.add(pair);
            }
        }
    }

    public List<int[]> removeTrappedAreas(int[] index, ArrayList<int[]> currentlyAvailableArea){
        removeColumn(index[0], currentlyAvailableArea);
        removeRow(index[1], currentlyAvailableArea);
        removeDiag(index, currentlyAvailableArea);
        return currentlyAvailableArea;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean shouldStop = false;
        for (int[] pair : arrayList) {
            if (!shouldStop) {
                ArrayList<int[]> newArr = new ArrayList<>(arrayList);
                List<int[]> result = backtrack(newArr, new ArrayList<>(), new int[]{pair[0], pair[1]});
                if (result != null) {
                    shouldStop = true;
                    System.out.println(result);
                }
            } else {
                break;
            }
        }


        return ans;
    }

    List<int[]> backtrack(ArrayList<int[]> remainingValues, ArrayList<int[]> selectedValues, int[] currentValue){
        if(selectedValues.size() == 4){
            System.out.println("hello");
            return selectedValues;
        }

        removeTrappedAreas(currentValue, remainingValues);
        if(remainingValues.isEmpty()){
            return null;
        }
        selectedValues.add(currentValue);

        boolean shouldStop = false;
        for (int[] pair : remainingValues) {
            if (!shouldStop) {
                ArrayList<int[]> newArr = new ArrayList<>(remainingValues);
                ArrayList<int[]> newSel = new ArrayList<>(selectedValues);
                List<int[]> result = backtrack(newArr, newSel, new int[]{pair[0], pair[1]});
                if (result != null) {
                    shouldStop = true;
                    System.out.println(result);
                }
            } else {
                break;
            }
        }
        return null;
    }

    void removeObject(int[] objectToRemove, ArrayList<int[]> arrayList){
        arrayList.removeIf(pair -> pair[0] == objectToRemove[0] && pair[1]== objectToRemove[1]);
    }

    void removeRow(int objRow, ArrayList<int[]> arrayList){
        arrayList.removeIf(pair -> pair[1]== objRow);
    }

    void removeColumn(int objColumn, ArrayList<int[]> arrayList){
        arrayList.removeIf(pair -> pair[0]== objColumn);
    }

    void removeDiag(int[] diagIndex, ArrayList<int[]> arrayList){
        //left top
        int xCoordinate = diagIndex[1];
        int yCoordinate = diagIndex[0];

        while(xCoordinate >= 0 && yCoordinate>=0 && xCoordinate < 4 && yCoordinate < 4){
            removeObject(new int[]{yCoordinate, xCoordinate}, arrayList);

            xCoordinate--;
            yCoordinate--;
        }


        //right top
        xCoordinate = diagIndex[1];
        yCoordinate = diagIndex[0];
        while(xCoordinate >= 0 && yCoordinate>=0 && xCoordinate < 4 && yCoordinate < 4){
            removeObject(new int[]{yCoordinate, xCoordinate}, arrayList);

            xCoordinate++;
            yCoordinate--;
        }


        //left bottom
        yCoordinate = diagIndex[0];
        xCoordinate = diagIndex[1];

        while(xCoordinate >= 0 && yCoordinate>=0 && xCoordinate < 4 && yCoordinate < 4){
            removeObject(new int[]{yCoordinate, xCoordinate}, arrayList);

            xCoordinate--;
            yCoordinate++;
        }


        //right bottom
        xCoordinate = diagIndex[1];
        yCoordinate = diagIndex[0];

        while(xCoordinate >= 0 && yCoordinate>=0 && xCoordinate < 4 && yCoordinate < 4){
            removeObject(new int[]{yCoordinate, xCoordinate}, arrayList);
            xCoordinate++;
            yCoordinate++;
        }
    }

    public static void main(String[] args) {
        new Nqueen().solveNQueens(4);
    }
}
