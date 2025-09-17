package cape;

import java.util.Scanner;

public class p7 { //car dealership
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int deal=sc.nextInt();
        for(int i=0;i<deal;i++){
            int cars=sc.nextInt();
            int bikes=sc.nextInt();
            System.out.println(cars*4+bikes*2);
        }
        }
    }

