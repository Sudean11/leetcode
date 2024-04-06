package mwa.twopointer;

public class TrappingRainWater {

    TrappingRainWater(){
        trap(new int[]{4,2,0,3,2,5});
    }

    public int trap(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int totalWaterTrapped = 0;
        int leftMaxHeight = 0;
        int rightMaxHeight = height[height.length -1];

        int maxPossibleWater = 0;
        while(leftIndex<rightIndex){
            if(height[leftIndex] < leftMaxHeight){
                maxPossibleWater = maxPossibleWater + leftMaxHeight - height[leftIndex];
            }else{
                totalWaterTrapped+=maxPossibleWater;
                leftMaxHeight = height[leftIndex];
            }

            if(height[rightIndex]< rightMaxHeight){
                maxPossibleWater = maxPossibleWater + rightMaxHeight - height[rightIndex];
            }else{
                totalWaterTrapped += maxPossibleWater;
                rightMaxHeight = height[rightIndex];
            }
            if(height[leftIndex]<height[rightIndex]){
                leftIndex++;
            }else{
                rightIndex--;
            }
        }
        System.out.println(maxPossibleWater);
        return maxPossibleWater;
    }
    public static void main(String[] args) {
        new TrappingRainWater();
    }
}
