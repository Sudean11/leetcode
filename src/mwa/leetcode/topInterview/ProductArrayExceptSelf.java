package mwa.leetcode.topInterview;

public class ProductArrayExceptSelf {

    ProductArrayExceptSelf(){
        productExceptSelf(new int[]{1,2,3,4});
    };
    public int[] productExceptSelf(int[] nums) {
        int[] leftMul = new int[nums.length];
        int[] rightMul = new int[nums.length];

        int mul = 1;
        for(int i=0;i<nums.length;i++){
            mul = mul*nums[i];
            leftMul[i] = mul;
        }
        mul = 1;
        for(int i=nums.length-1; i>=0; i--){
            mul = mul*nums[i];
            rightMul[i] = mul;
        }

        int[] product = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i==0){
                product[i] = 1*rightMul[i+1];
                continue;
            }
            if(i == nums.length -1){
                product[i] = leftMul[i-1]*1;
                continue;
            }
            product[i] = leftMul[i-1]*rightMul[i+1];
        }
        return  product;
    }

    public static void main(String[] args) {
        new ProductArrayExceptSelf();
    }
}
