package scope;//omly accesible in one funcn

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="jaydeep";
        {
            a=78;
            int c=99;//vlues initialsied in this block will remqain in block(block scope)
            name="sankalp";
            System.out.println(a);
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
        //scope for loop
        for (int i = 0; i < 4; i++) {
            int num=50;
            int innerA=54;
            
        }


    }
    static void random(){
        int num=67;
        System.out.println(num);
    }
}
