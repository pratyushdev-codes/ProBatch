import java.util.HashMap;

public class MinimalLengthSubarraySumK {
    public static void main(String[] args) {
        
    }public static void MinimalLengthSubarraysum(int arr [], int k){
        HashMap <Integer, Integer> hm = new HashMap<>();
        int count =0;
        int sum =0;
        int minDist =0;

        for(int i =0;i<arr.length;i++){
            sum = sum + 1;
            if(hm.containsKey(sum-k)){
                count =count+ hm.get(sum -k);
            }

            minDist= Math.min(minDist, count);
            hm.put(sum , hm.getOrDefault(sum,0)+1);
        }
    }

}
