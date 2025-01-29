import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {


    // this solution is mine and has some problems becuse the answer should be 4 and its showing 3
    public static int LSWRC_HashSet(String str){

        int longestLength = 0;
        HashSet<Character> characters = new HashSet<>();

        for(int i = 0; i<str.length();i++){
            if(!characters.contains(str.charAt(i))){
                characters.add(str.charAt(i));
            }
            else{
                longestLength = Math.max(longestLength, characters.size());
                characters.clear();
                characters.add(str.charAt(i));
            }
        }

        return longestLength;

    }

    public static int longestSubstringWithoutRepeating_slidingWindow(String str ){
        if(str == null || str.isEmpty()){
            return 0;
        }

        if(str.length() == 1){
            return 1;
        }

        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();

        while(right < str.length()){
            char c = str.charAt(right);
            while(set.contains(c)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, (right-left) + 1);
            right++;
        }
        return ans;
    }


    public static void main(String[] args) {
        String str = "abca+man";
        System.out.println(LSWRC_HashSet(str));
        System.out.println(longestSubstringWithoutRepeating_slidingWindow(str));
    }


}
