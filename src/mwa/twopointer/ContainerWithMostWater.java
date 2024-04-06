package mwa.twopointer;

public class ContainerWithMostWater {
    ContainerWithMostWater(){
        maxArea(new int[]{1,1});
    }
    public int maxArea(int[] height) {
        System.out.println("hello");
        int firstIndex = 0;
        int lastIndex = height.length-1;
        int maxArea = 0;
        while(firstIndex < lastIndex){
            int yAxis = lastIndex - firstIndex;
            int tempArea = 0;
            if(height[firstIndex]> height[lastIndex]){
                tempArea = yAxis * height[lastIndex];
                lastIndex --;
            }else{
                tempArea = yAxis * height[firstIndex];
                firstIndex++;
            }
            if(maxArea < tempArea){
                maxArea = tempArea;
            }
        }
        System.out.println(maxArea);
        return maxArea;
    }
    public static void main(String[] args) {
        new ContainerWithMostWater();
    }
}
