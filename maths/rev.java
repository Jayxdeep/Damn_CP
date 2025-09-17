class revvv {
    public int reverse(int x) {
        
        int revn=0;
        while(x!=0){
            int ld=x%10;
           
            x=x/10;
            revn=revn*10+ld;
        }
        return revn;
        
    }
    public static void main(String args[]){
        revvv soln=new revvv();
        int x=123;
        System.out.println(soln.reverse(x));
        
    } 
}

