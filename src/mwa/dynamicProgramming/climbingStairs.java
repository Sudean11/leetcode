package mwa.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class climbingStairs {
    int totalWays = 0;
    Map<Integer, Integer> memo = new HashMap<>();
    climbingStairs(){
        System.out.println(climbStairs(3));
    }

    public int climbStairs(int n) {
        int total = helper(n);
        System.out.println(total);
        return totalWays;
    }

    private int helper(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int ways = helper(n - 1) + helper(n - 2);
        memo.put(n, ways);
        return ways;
    }

    public static void main(String[] args) {
        new climbingStairs();
    }
}
