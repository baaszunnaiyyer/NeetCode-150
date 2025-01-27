import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] numbs){

        if(numbs.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < numbs.length; i++){
            set.add(numbs[i]);
        }

        int LCS = 1;
        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }
            else {
                int currentNum = num;
                int currentSub = 1;
                while (set.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }

                LCS = Math.max(LCS, currentSub);
            }
        }
        return LCS;
    }

    public static void main(String[] args) {
        int[] numbs = {4,7,5,1,2,3,100,500,101,102};
        System.out.println(longestConsecutive(numbs));
    }
}
