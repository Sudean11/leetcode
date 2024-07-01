package mwa.Graph;

import java.util.*;

public class CourseSchedule {

    CourseSchedule(){
        System.out.println(canFinish(2, new int[][]{{1,4},{2,4},{3,1},{1,3}}));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preRequisits = new HashMap<>();
        for(int i=0; i<prerequisites.length;i++){
            if(!preRequisits.containsKey(prerequisites[i][0])){
                List<Integer> newList = new ArrayList<>();
                newList.add(prerequisites[i][1]);
                preRequisits.put(prerequisites[i][0], newList);
                continue;
            }
            preRequisits.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Set<Integer> visitedNode;
        visitedNode = new HashSet<>();
        for(int i = 0;i<numCourses; i++){
            if (!dfs(preRequisits, i, visitedNode)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Map<Integer, List<Integer>> preRequisits, Integer key, Set<Integer> visitedNode) {
        if(!preRequisits.containsKey(key)){
            return  true;
        }
        if(visitedNode.contains(key)){
            return false;
        }
        visitedNode.add(key);
        for(Integer newKey: preRequisits.get(key)){
            if(!dfs(preRequisits, newKey, visitedNode)){
                return false;
            }
        }
        visitedNode.remove(key);
        preRequisits.remove(key);
        return true;
    }

    public static void main(String[] args) {
        new CourseSchedule();
    }
}
