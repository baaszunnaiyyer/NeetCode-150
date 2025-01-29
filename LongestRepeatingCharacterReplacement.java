import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k){

        int[] ocurance  = new int[26];
        int left = 0, right = 0;
        int ans = 0;
        int maxOccurance = 0;

        for(right = 0; right<s.length(); right++){
            maxOccurance = Math.max(maxOccurance, ++ocurance[s.charAt(right) - 'A']);
            if(right - left +1 -maxOccurance > k){
                ocurance[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right-left +1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "XXXA";
        System.out.println(characterReplacement(s,2));
    }

}
