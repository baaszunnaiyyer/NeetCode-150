import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] numbs, int k){
        if(numbs == null || numbs.length == 0 || k<=0)
            return new int[0];

        int n = numbs.length;
        int[] result = new int[n - k +1];
        Deque<Integer> deque = new LinkedList<>();

        for(int i =0; i<n; i++){
            while(!deque.isEmpty() && deque.peek() < i - k +1){
                deque.poll();
            }
            while (!deque.isEmpty() && numbs[deque.peekLast()] < numbs[i]){
                deque.pollLast();
            }

            deque.offer(i);

            if(i >= k -1){
                result[i-k+1] = numbs[deque.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbs = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(numbs, 3)));
    }

}
