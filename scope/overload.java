package scope;

public class overload {
    public static void main(String[] args) {
        fun(1);
        fun("jaydeep");
        
    }

    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);

    }
}
