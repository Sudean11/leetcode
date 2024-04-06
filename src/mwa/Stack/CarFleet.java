package mwa.Stack;

import java.util.*;

public class CarFleet {

    CarFleet(){
        carFleet(12,new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3});
    }
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Integer> carFleet = new TreeMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int index = 0; index< position.length; index++){
            carFleet.put(position[index], speed[index]);
        }
        List<Integer> positions = new ArrayList<>();
        for(Integer singleTree: carFleet.keySet()){
            System.out.println(singleTree+" " +carFleet.get(singleTree));
            positions.add(singleTree);
        }
        positions = positions.reversed();

        stack.push(positions.get(0));

        for(int startingPosition : positions){
            float timeToReachFinish = (float) (target - startingPosition) /carFleet.get(startingPosition);
            int vehicleAhead = stack.peek();
            float timeForPrevCar = (float) (target - vehicleAhead) /carFleet.get(vehicleAhead);
            if(timeToReachFinish > timeForPrevCar){
                stack.add(startingPosition);
            }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        new CarFleet();
    }
}
