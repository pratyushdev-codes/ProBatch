//Array Method
import java.util.Arrays;

public class CountingFrequencies {
    public static void main(String[] args) {
        
    }public static void countFreq(int arr [], int n){
        boolean Visited[]= new boolean[n];
        Arrays.fill(Visited, false);

        for(int i =0;i<n;i++){
            if(Visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]== arr[j]){
                    Visited[j]= true;
                    count ++;
                }
            }
            System.out.println(arr[i]+" "+ count);
        }

    }
}
