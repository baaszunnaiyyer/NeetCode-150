import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean CD_HashSet(int[] nums){
        // Creating a Hash Table to store all the numbers and Determining the  Values if it is being repeated
        HashSet<Integer> seenNumbers = new HashSet<>();

        // iterate through each element in the array
        for(int num: nums){
            if(seenNumbers.contains(num)){
                //Return true if the element is repeated
                return true;
            }
            // adding element in HashTable
            seenNumbers.add(num);
        }
        //Returning False if nothing is Duplicated
        return false;
    }





    //Creating one That is using The Brute Force Method

    public static boolean CD_BruteForce(int[] nums){

        // First Loop that'll select the element who we'll compare the elements with in the List
        for(int i = 0; i < nums.length; i++){
            // second Loop for the element which it'll be compared with
            for(int j = i+1; j< nums.length; j++){
                //comparison if the element repeats itself
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        // returns false if the Subject do not appear
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};

        System.out.println(CD_BruteForce(nums));
        System.out.println(CD_HashSet(nums));
    }

}
