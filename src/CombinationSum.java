import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combination = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int start = 0;
        helper(combination, start, list, candidates, target);
        return combination;
    }

    private void helper(List<List<Integer>> combination,
                        int start,
                        List<Integer> list,
                        int[] candidates,
                        int target) {
        if(start >= candidates.length){
            if(list.stream().mapToInt(Integer::intValue).sum() == target){
                combination.add(new ArrayList<>(list));
            }
            return;
        }

        if(list.stream().mapToInt(Integer::intValue).sum() > target){
            return;
        }
        list.add(candidates[start]);
        helper(combination, start, list, candidates, target);
        list.remove(list.size()-1);
        helper(combination, start+1, list, candidates, target);
    }

    CombinationSum(){
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }
    public static void main(String[] args) {

        new CombinationSum();
    }
}
