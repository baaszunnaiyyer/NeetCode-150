public class ContainerWithMostWater {

    public static int maxWaterContainer(int[] numbs){
        int max =0;
        int area=0;

        int left = 0;
        int right = numbs.length-1;
        int width = numbs.length-1;

        while(left<right){

            if(numbs[left]<numbs[right]){
                area = width*numbs[left];
                left++;
            }else if(numbs[right]<numbs[left]){
                area = width*numbs[right];
                right--;
            }
            max = Math.max(area, max);
            width--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbs = {3,2,7,4,1,3,6,2};
        System.out.println(maxWaterContainer(numbs));
    }

}
