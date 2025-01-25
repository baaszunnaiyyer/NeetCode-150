import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){

        // Creating hashmap to store all the values and there indexes as Key and Value
        HashMap<Integer,Integer> map = new HashMap<>();

        // iterating through the list and storing it in the Hashmap ap comparing it along the way
        for(int i = 0; i< nums.length; i++){

            // calculating the complement value
            int complement  = target - nums[i];

            //if the value dose exists then it will return the new int array
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] x =  {1,2,3,4};
        twoSum(x, 4);
    }
}
