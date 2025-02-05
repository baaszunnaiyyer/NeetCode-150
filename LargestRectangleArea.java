import java.util.Stack;

public class LargestRectangleArea {

    public static int lRectangleArea(int[] heights){
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n =  heights.length;

        for(int i =0; i<= n; i++){
            int currentHeight = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int hight = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() -1;
                maxArea = Math.max(maxArea, hight * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] h = {2,1,3,1,2,3,1,2,3};

        System.out.println(lRectangleArea(h));
    }

}
