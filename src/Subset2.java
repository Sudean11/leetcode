import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Subset2 {

    Subset2(){
        subsetsWithDup(new int[]{1,2,3});
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsetsWithDup = new ArrayList<>();
        Set<List<Integer>> subSet = new HashSet<>();
        List<Integer> remainingValues = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> exestingValue = new ArrayList<>();
        subSet = helper(subSet, remainingValues, exestingValue);
        subsetsWithDup = new ArrayList<>(subSet);
        System.out.println(subsetsWithDup);
        return subsetsWithDup;
    }

    private Set<List<Integer>> helper(Set<List<Integer>> subSet, List<Integer> remainingValues, List<Integer> exestingValue) {
        if(remainingValues.isEmpty()){
            subSet.add(exestingValue);
        }
        System.out.println(exestingValue);
        for(int i = 0; i<remainingValues.size(); i++){

            ArrayList<Integer> newExisting = new ArrayList<>(exestingValue);
            newExisting.add(remainingValues.get(i));

            ArrayList<Integer> newRemaining = new ArrayList<>(remainingValues);

            newRemaining.remove(remainingValues.get(i));
            helper(subSet, newRemaining, newExisting);

        }
        return subSet;
    }



    public static void main(String[] args) {
        System.out.println(new Subset2());
    }
}
