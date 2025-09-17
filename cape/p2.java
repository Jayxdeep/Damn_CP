package cape;

import java.util.Scanner;

public class p2 {//checking how many times the character exists in current str
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        String op=Count(ip);
        System.out.println(op);

    }
    public static String Count(String str){
        StringBuilder res=new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;){
            int cnt=0;
            char ch=str.charAt(i);
            while(i<n && str.charAt(i)==ch){
                cnt++;
                i++;
            }
            res.append(ch);
            if(cnt>1){
                res.append(cnt);
            }
        }
        return res.toString();
    }
}
