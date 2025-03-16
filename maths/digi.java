public class digi {
    public static int countDigits(int n){
        int cnt=0;
        while(n>0){
            int ld=n%10;
            cnt=cnt+1;
            n=n/10;
        }
        return cnt;
    }  
}
