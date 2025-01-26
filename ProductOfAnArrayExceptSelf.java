import java.util.Arrays;

public class ProductOfAnArrayExceptSelf {

    public static int[] ProductOfArrayES(int[] numbs){

        int[] result = new int[numbs.length];

        Arrays.fill(result,1);

        int pre = 1, post = 1;

        for(int i=0; i< numbs.length; i++){
            result[i] = pre;
            pre = numbs[i] * pre;
        }

        for(int i = numbs.length-1; i >= 0; i--){
            result[i] = result[i] * post;
            post = post * numbs[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbs = {1,2,3,4};
        System.out.println(Arrays.toString(ProductOfArrayES(numbs)));
    }
}
