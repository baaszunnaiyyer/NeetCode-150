public class KokoEatingBanana {

    public static int minEatingSpeed(int[] piles, int hour){
        int left =1, right = 1;
        for (int pile: piles){
            right = Math.max(right, pile);
        }

        while(left < right){
            int mid = left + (right - left) / 2;
            if(canFinish(piles, mid, hour)){
                right = mid;
            }else {
                left = mid +1;
            }
        }
        return left;
    }

    private static boolean canFinish(int[] piles, int speed, int h){
        int hours = 0;
        for(int pile: piles){
            hours += Math.ceil((double) pile / speed);
        }

        return hours <= h;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};

        System.out.println(minEatingSpeed(piles, 8));
    }
}
