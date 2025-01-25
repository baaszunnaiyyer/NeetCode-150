import java.util.*;

public class Group_Anagram {

    public static List<List<String>> GroupAnagram(String[] strs) {

        // checking if the given list is Empty or not
        if(strs.length == 0){
            return new ArrayList<>();
        }

        //creating a hashMap so that we can store each element on the basis of key and value pairs
        Map<String, List<String>> ansMap = new HashMap<>();

        // creating the total length of count of all alphabets
        int[] count = new int[26];

        // going through the list of all words and changing the digit according to it
        for(String s: strs){
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }

            //Creating a String Builder so it can be Manipulated
            StringBuilder sb = new StringBuilder();

            //appending the String in that Sting Builder
            for(int i = 0; i<26; i++){
//                sb.append("#");
                sb.append(count[i]);
            }

            //Setting/Checking the Key and its Value
            String key = sb.toString();
            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList<>());
            }

            //if it exists then it will return the arraylist on ansMap.get(key) and with add() it will add the value
            ansMap.get(key).add(s);
        }

        //returns the ArrayList as it was given
        return new ArrayList<>(ansMap.values());
    }

    public static void main(String[] args) {

        String[] name = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(GroupAnagram(name));
    }

}
