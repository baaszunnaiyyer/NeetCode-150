import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static int[] dailyTemperature(int[] temperature){

        int n =  temperature.length;
        int[] ans =  new int[n];

        Stack<Integer> stack = new Stack<>();

        for( int i =0; i< n; i++){
            while(!stack.isEmpty() && temperature[i] > temperature[stack.peek()]){
                int index = stack.pop();
                ans[index] = i -index;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] q = {73,74,75,71,67,72,76,73};
        System.out.println(Arrays.toString(dailyTemperature(q)));
    }


}
