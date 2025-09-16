package str.easy;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First string:");
        String s=sc.nextLine();
        System.out.println("Second String:");
        String t=sc.nextLine();
        System.out.println(isIso(s, t));
    }
    public static boolean isIso(String s,String t){
        int m1[]=new int[256];
        int m2[]=new int[256];
        int n=s.length();
        for(int i=0;i<n;i++){
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]){
                return false;
            }
            m1[s.charAt(i)]= i+1;// initial array is 0 so add +1 
            m2[t.charAt(i)]=i+1;
        }
        return true;
    }
}