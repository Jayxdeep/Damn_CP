class soln{
	public boolean armstrong(int n){
	int sum=0;
	int dup=n;
	int cntdigits=0;
	int temp=n;
	while(temp>0){
		temp=temp/10;
		cntdigits++;
	}
        while(n>0){
            int ld=n%10;
            // sum=sum+(ld*ld*ld);//cube to get the armstrong number hardcode formula
			sum+=(int)Math.pow(ld, cntdigits);
            n=n/10;
        }
        return sum==dup;
}
}

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		soln solun=new soln();
		int n1=371;
		int n2=18;
		System.out.println(solun.armstrong(n2));
		System.out.println(solun.armstrong(n1));

	}
}

