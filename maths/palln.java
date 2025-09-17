public class palln {
    public static boolean palindromeNumber(int n){
        // Write your code here
        int revn=0;
        int dup=n;
        while(n!=0){
            int ld=n%10;
           
            n=n/10;
            revn=revn*10+ld;
        }
        return dup==revn;
    }
public static void main(String args[]){
    int num=121;
    if(palindromeNumber(num)){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
} 
}