import java.util.*;

public class Top_K_frequency {

    // Function for finding the frequency of the top k element
    public static int[] Frequency(int[] numbs, int k){
        // if the length of the list is equals to the target then the list is the answer
        if(numbs.length == k || numbs.length < k){
            return numbs;
        }

        // creating the Hashmap to store the data of all the values to there Frequency
        Map<Integer, Integer> count = new HashMap<>();
        for(int i:numbs){
            count.put(i, count.getOrDefault(i,0) +1);
        }

        // Creating a Queue with On the basis of Priority that element a count.get(a) comes first if its lowest
        Queue<Integer> heap = new PriorityQueue<>(
                (a,b) -> count.get(a)-count.get(b));


        // now well add the Keys in the queue and theyll be sorted on the basis of there frequency
        for(int n: count.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        //creating the answer array by going over each element of the list
        int[] ans = new int[k];
        for(int i = 0;i<k; i++){
            ans[i] = heap.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbs = {1,3,4,3,3,4,2,3,4,2,5,4,5,5};
        System.out.println(Arrays.toString(Frequency(numbs,2)));
    }

}
