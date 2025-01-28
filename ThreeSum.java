import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] numbs){

        //First we Sorted the array
        Arrays.sort(numbs);

        //We Created a 2D List List
        List<List<Integer>> result = new ArrayList<>();

        // a Loop to paas over the int array
        for(int i=0; i<numbs.length; i++){

            //check if it's the first number and it's not equal to its previous
            if (i == 0 || numbs[i] != numbs[i - 1]) {
                twoSum(numbs, i, result);
            }

        }

        return result;
    }

    // to calculate the Two sum form the three sum
    void twoSum(int[] nums, int i, List<List<Integer>> result) {

        // Initilizing Pointers
        int left = i + 1;
        int right = nums.length - 1;

        // checking if the value of left side increases
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            //if the value is less then the required sum then we'll increase the value of left pointer
            if (sum < 0) {
                left++;
            }
            // else we are decreasing the value of right pointer
            else if (sum > 0) {
                right--;
            }
            // and if both have equal value then  we'll add the answer as an array in 2D list
            else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                //checks if the value is repeating
                while (left < right && nums[left] == nums[left - 1]) {
                    ++left;
                }
            }
        }

    }
}
