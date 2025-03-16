package random;
import java.util.Scanner;

public class d2b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter decimal");
        int d=sc.nextInt();
        int bi[]=new int[32];
        int index=0;
        while (d>0) 
        {
        bi[index++]=d%2;
        d=d/2;  
        }
        System.out.println("binary number");
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(bi[i]);
        }
    }
}
