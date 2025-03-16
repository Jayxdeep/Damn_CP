package methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      //int ans=  sum2();calling the func sum or sum2 
      int ans=sum3(10,20);
      System.out.println(ans);//return 30 from sum2 stored in ans
    }
// return value
    static int sum3(int a,int b){
       int tot=a+b;
       return tot;
    }
    static  int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no");
        int n1=sc.nextInt();
        System.out.println("enter 2nd");
        int n2=sc.nextInt();
        int tot=n1+n2;
        return tot;
        
    }
     static void sum(){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no");
        int n1=sc.nextInt();
        System.out.println("enter 2nd");
        int n2=sc.nextInt();
        int tot=n1+n2;
        System.out.println(tot);
    }
}
