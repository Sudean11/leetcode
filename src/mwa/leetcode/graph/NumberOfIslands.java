package mwa.leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    NumberOfIslands(){
        numIslands(new char[][] {
                {'1', '0', '1'},
                {'1', '0', '1'},
                {'1', '1', '1'}
        });
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i= 0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    System.out.println(i+","+j);
                    count++;
                    Queue<Integer[]> queue = new LinkedList<>();
                    queue.add(new Integer[]{i,j});
                    queue.add(null);
                    while(queue.peek()!=null){
                        while(queue.peek()!=null){
                            int xCorrdinate = queue.peek()[0];
                            int yCorrdinate = queue.peek()[1];
                            grid[xCorrdinate][yCorrdinate] = '0';
                            int above = xCorrdinate-1;
                            if(above >= 0){
                                if(grid[above][yCorrdinate] == '1'){
                                    queue.add(new Integer[]{above, yCorrdinate});
                                }
                            }
                            int below = xCorrdinate+1;
                            if(below < grid.length){
                                if(grid[below][yCorrdinate] == '1'){
                                    queue.add(new Integer[]{below, yCorrdinate});
                                }
                            }

                            int right = yCorrdinate+1;
                            if(right < grid[0].length){
                                if(grid[xCorrdinate][right] == '1'){
                                    queue.add(new Integer[]{xCorrdinate, right});
                                }
                            }
                            int left = yCorrdinate-1;
                            if(left >= 0){
                                if(grid[xCorrdinate][left] == '1'){
                                    queue.add(new Integer[]{xCorrdinate, left});
                                }
                            }
                            queue.poll();
                        }
                        queue.poll();
                        queue.add(null);
                    }

                }
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        new NumberOfIslands();
    }
}
