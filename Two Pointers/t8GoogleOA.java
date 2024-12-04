public class t8GoogleOA {
    public static void main(String[] args) {
        
    }
    
    ///this is the helper function
    public boolean checkAapprearsB(String A , String B){
        int count =0;
        int i = 0 ;
        int j = 0 ;
        while(i<A.length() && j < B.length()){
            if(A.charAt(i)!=B.charAt(j)){
                i = i+1;
            }else{
                i++;
                j++;
                count++;
            }
        }
        if(count==B.length()){
            return true;
        }
        return false;
    }

}
