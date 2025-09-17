package random;
import java.util.Scanner;

public class useer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int x=sc.nextInt();
        
        if(x>0){
            System.out.println("positive");
        }else if(x<0){
            System.out.println("negative");
        }else{
            System.out.println("value is 0");
        }
        sc.close();
    }
}
