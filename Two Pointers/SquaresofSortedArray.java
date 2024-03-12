import java.util.Scanner;

public class SquaresofSortedArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(squaresSortedArray(arr));
    }public static int[] squaresSortedArray(int arr []){
        
        int n = arr.length;
        int left = 0;
        int  right=n-1;
        int [] j = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = arr[i]*arr[i];          
        }
        for(int i = n-1 ;i>=0 ;i--){
            if(arr[left]> arr[right]){
                j[i] = arr[left];
                left++;
            }else{
                j[i]=arr[right];
                right --;
            }}
           return j;
        }
      
        
     
    }
    
