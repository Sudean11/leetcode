package mwa;

public class ProductArrayExceptSelf {

    ProductArrayExceptSelf(){
        productExceptSelf(new int[]{-1,1,0,-3,3});
    }

    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int[] postFix = new int[nums.length];

        int mul = 1;
        for(int i = 0 ;i<nums.length; i++){
            prefixArr[i] = mul*nums[i];
            mul = mul*nums[i];
        }
        mul = 1;
        for(int i = nums.length -1 ; i>=0; i--){
            postFix[i] = nums[i]*mul;
            mul = mul*nums[i];
        }

        int[] output = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                output[i] = postFix[i + 1];
            }
            else if(i == nums.length-1){
                output[i] = prefixArr[i-1];
            }else{
                output[i] = prefixArr[i -1]*postFix[i+1];
            }
        }

        for(int num:output){
            System.out.println(num);
        }

        return output;

    }

    public static void main(String[] args) {
        new ProductArrayExceptSelf();
    }
}
