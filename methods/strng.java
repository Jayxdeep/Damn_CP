package methods;

import java.util.Scanner;

public class strng {//return string
    public static void main(String[] args) {
        //String msg=dis();
        //System.out.println(msg);  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();
        String permsg=mygreet(name);
        System.out.println(permsg);
    }
    static String mygreet(String name){
        String msgs="hello"+ " " +name;
        return msgs;
    }
    static String dis(){
      String greet="hey";
      return greet;
    }
} 
