import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
    Permutation(){

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> permutation = new ArrayList<>();
        ArrayList<Integer> remainingList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> currentList = new ArrayList<>();
        permutation = helper(permutation, remainingList, currentList);
        return permutation;
    }

    private List<List<Integer>> helper(List<List<Integer>> permutation, ArrayList<Integer> remainingList, ArrayList<Integer> currentList) {
        if(remainingList.isEmpty()){
            permutation.add(currentList);
        }
        for(int i = 0; i < remainingList.size(); i++){
            ArrayList<Integer> newCurrent = new ArrayList<>();
            newCurrent.addAll(currentList);
            newCurrent.add(remainingList.get(i));
            ArrayList<Integer> newRemainingList = new ArrayList<>();
            newRemainingList.addAll(remainingList);
            newRemainingList.remove(remainingList.get(i));
            helper(permutation, newRemainingList, newCurrent);
        }
        return  permutation;
    }
    public static void main(String[] args) {
        System.out.println(new Permutation().permute(new int[]{1,2,3,4}));
    }
}


