public class IsAnagram {

    public boolean isAnagram(String s, String t){

        // checking the length of both the strings
        if (s.length() != t.length()){
            return false;
        }

        // initializing the charCount
         int[] charCounts = new int[26];

        // adding for loop for the addition and subtraction in the charCounts
        for(int i=0; i< s.length(); i++){

            // now what we are doing here is that we are subtracting the ASCII Value
            // the character from "a" if ASCII value of "a" is 98 and s.charAt(i) is 'a' then 98 - 98 = 0
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //checking if the list is all 0 or not
        for(int count: charCounts) {
            if(count != 0){
                return false;
            }
        }

        //returning true if all the values turn out to be zero
        return true;
    }

    public static void main(String[] args) {
    }

}
