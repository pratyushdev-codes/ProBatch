import java.util.Scanner;

public class bs8amazonOA {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int piles [] = new int [n];
            for(int i : piles){
                piles[i] = sc.nextInt();
            }

            int x = sc.nextInt();

        }public int countSteps (int arr [] , int x){
            int ans = 0;
            for(int i= 0 ; i< arr.length ; i++){
                ans+= Math.ceil((int)arr[i]/(int)x);
            }
            return ans;
        }    

        }
   

