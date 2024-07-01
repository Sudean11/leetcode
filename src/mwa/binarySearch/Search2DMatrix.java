package mwa.binarySearch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Search2DMatrix {
    Search2DMatrix(){
        int[][] array = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(searchMatrix(array, 1));
    }


    public boolean searchMatrix(int[][] matrix, int target) {

        List<Integer> list = Arrays.stream(matrix).flatMapToInt(x-> Arrays.stream(x)).boxed().collect(Collectors.toList());
        System.out.println(list);

        int leftPoint = 0;
        int rightPoint = list.size() - 1;
        int midPoint;
        while(leftPoint <= rightPoint){
            midPoint = (leftPoint+rightPoint)/2;
            if(list.get(midPoint) == target){
                return true;
            }
            if(list.get(midPoint) > target){
                rightPoint = midPoint-1;
            }else{
                leftPoint = midPoint+1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        new Search2DMatrix();
    }
}
