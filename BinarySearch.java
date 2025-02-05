public class BinarySearch {
    public static int binarySearch(int[] numbs, int target){
        int l = 0, r = numbs.length -1;

        while (l <= r){
            int mid = l + (r - l) /2;

            if( numbs[mid] == target ){
                return mid;
            }else if( numbs[mid] < target){
                l = mid + 1;
            }else if(numbs[mid]  > target){
                r = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] numbs = {-1,0,5,6,9,11,13};

        System.out.println(binarySearch(numbs, 9));
    }
}
