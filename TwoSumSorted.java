import java.util.Arrays;

public class TwoSumSorted {

    public static int[] twoSum(int[] numbs,int target){

        int left =0;
        int right = numbs.length -1;

        while(left<right){
            if(numbs[left]+numbs[right] > target){
                right--;
            } else if (numbs[left]+numbs[right] < target) {
                left++;
            } else if (numbs[left]+numbs[right] == target) {
                return new int[] {left+1, right+1};
            }
        }

        return new int[] {};
    };

    public static void main(String[] args) {

        int[] numbs = {1,4,5,7,50,100};
        System.out.println(Arrays.toString(twoSum(numbs, 9)));

    }

}
