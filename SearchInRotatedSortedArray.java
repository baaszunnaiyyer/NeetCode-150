import com.sun.source.tree.BreakTree;

public class SearchInRotatedSortedArray {

    public static boolean search(int[] numbs,int target){
        int left = 0;
        int right = numbs.length-1;



        while(left <= right){
            int mid = (left+right)/2;
            if(numbs[mid] == target){
                return true;
            }

            if(numbs[left] <= numbs[mid]){
                if(target < numbs[left] || target > numbs[mid]){
                    left =1;
                }
                else {
                    right = mid -1;
                }
            }else{
                if(target > numbs[right] || target < numbs[mid])
                    right = mid -1;
                else
                    left = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbs  = {3,4,5,6,7,0,1,2};
        System.out.println(search(numbs, 8));
    }
}
