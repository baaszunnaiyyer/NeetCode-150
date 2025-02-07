public class FindMinimumInRotatedSortedArray {

    public static int findMinimum(int[] numbs){
        int left= 0;
        int right = numbs.length -1;
        int ans = numbs[0];

        if(numbs.length ==1 ){
            return numbs[0];
        }

        while(left <= right){

            if(numbs[left] < numbs[right]){
                ans = Math.min(ans, numbs[left]);
            }

            int mid = left + (right - left)/2;

            ans = Math.min(ans, numbs[mid]);

            if(numbs[left] <=  numbs[mid]){
                left = mid +1;

            }else {
                right = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbs = {3,4,5,0,1,2};

        System.out.println(findMinimum(numbs));
    }
}
