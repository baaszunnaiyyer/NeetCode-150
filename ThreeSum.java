import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] numbs){

        //First we Sorted the array
        Arrays.sort(numbs);

        //We Created a 2D List List
        List<List<Integer>> result = new ArrayList<>();


        for(int i=0; i<numbs.length; i++){

            if (i == 0 || numbs[i] != numbs[i - 1]) {
                twoSum(numbs, i, result);
            }

        }

        return result;
    }

    void twoSum(int[] nums, int i, List<List<Integer>> result) {

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                while (left < right && nums[left] == nums[left - 1]) {
                    ++left;
                }
            }
        }

    }
}
