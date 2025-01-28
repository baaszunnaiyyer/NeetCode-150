public class TrappingRainWater {

    public static int trappingWater(int[] numbs){

        //initializing left pointer and right pointer
        int left = 0;
        int right = numbs.length -1;

        // declaring the values for total left max and right max
        int total = 0;
        int leftmax= numbs[left];
        int rightmax = numbs[right];


        // checking if the left pointer is less the right pointer
        while(left<right){

            // if the value of left pointer is less than right pointer we'll apply the formula l[max] - current height
            if(numbs[left]< numbs[right]){
                leftmax = Math.max(leftmax, numbs[left]);
                if(leftmax - numbs[left] > 0){
                    total = total+(leftmax - numbs[left]);
                }
                left++;
            }
            // else doing the same thing for right
            else{
                rightmax = Math.max(rightmax, numbs[right]);
                if(rightmax - numbs[right] > 0 ){
                    total += rightmax - numbs[right];
                }
                right--;
            }

        }

        // returning total value
        return total;
    }

    public static void main(String[] args) {
        int[] numbs = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater(numbs));
    }

}
