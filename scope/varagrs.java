package scope;

import java.util.Arrays;

public class varagrs {
    public static void main(String[] args) {
        func(2,3,4,43,42,4,24);
        mul(2, 3, "jaydeeo","Rahul");
    }
     static void mul(int a,int b,String...v){

     }

    static void func(int...v){
        System.out.println(Arrays.toString(v));
    }
}
