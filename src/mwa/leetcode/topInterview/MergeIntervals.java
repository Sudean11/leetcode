package mwa.leetcode.topInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    MergeIntervals(){
        int[][] intervals = {
                {1,4},{0,1}
        };
        merge(intervals);
    }

    public int[][] merge(int[][] intervals) {
        List<int[]> list  = new ArrayList<>();
        int i = 1;
        int leftValue = intervals[0][0];
        int rightValue = intervals[0][1];
        while(i<intervals.length){
            if(rightValue >= intervals[i][0] ){
                if(rightValue < intervals[i][1]) rightValue = intervals[i][1];
                if(leftValue > intervals[i][0]) leftValue = intervals[i][0];
                i++;
                continue;
            }
            if(rightValue< intervals[i][0]){
                list.add(new int[]{leftValue, rightValue});
                leftValue = intervals[i][0];
                rightValue = intervals[i][1];
                i++;
            }
        }
        list.add(new int[]{leftValue, rightValue});
        for(int[] single: list){
            System.out.println(single[0] + " "+ single[1]);
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        new MergeIntervals();
    }
}
