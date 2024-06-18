package mwa.leetcode.topInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphNoOfIsland {
    char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };
    GraphNoOfIsland(){
        List<Integer>[] list = new ArrayList[2];
        numIslands();
    }

    public int numIslands() {
        int numOfIsland = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j= 0; j< grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numOfIsland++;
                    bfs(i, j);
                }
            }
        }
        System.out.println(numOfIsland);
        return 0;
    }

    private void bfs(int i, int j) {
        System.out.println("how many times");
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        int s =3;
        
        queue.add(null);

        while(queue.peek()!=null){
            int[] temp = queue.peek();
            if(temp[0]<0 || temp[0]>=grid.length || temp[1] < 0 || temp[1] >= grid[0].length ){
                continue;
            }
            System.out.println(temp[0]+" "+temp[1]);
            grid[temp[0]][temp[1]] = '0';
            while(queue.peek() != null){
                queue.poll();
                queue.add(new int[]{temp[0]-1, temp[1]});
                queue.add(new int[]{temp[0]+1, temp[1]});
                queue.add(new int[]{temp[0], temp[1]-1});
                queue.add(new int[]{temp[0], temp[1]+1});
            }
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        new GraphNoOfIsland();
    }
}
