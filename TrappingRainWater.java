public class TrappingRainWater {

    public static int trappingWater(int[] numbs){
        int left = 0;
        int right = numbs.length -1;

        int total = 0;
        int leftmax= numbs[left];
        int rightmax = numbs[right];

        while(left<right){
            if(numbs[left]< numbs[right]){
                leftmax = Math.max(leftmax, numbs[left]);
                if(leftmax - numbs[left] > 0){
                    total = total+(leftmax - numbs[left]);
                }
                left++;
            }
            else{
                rightmax = Math.max(rightmax, numbs[right]);
                if(rightmax - numbs[right] > 0 ){
                    total += rightmax - numbs[right];
                }
                right--;
            }

        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbs = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater(numbs));
    }

}
