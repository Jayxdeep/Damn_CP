package str.easy;

public class p7 { //rotatestr   
    public static boolean rorstr(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        return(s+s).contains(t);
    }
    public static void main(String[] args) {
        String s="abcde";
        String t="cdeab";
        System.out.println(rorstr(s, t));
    }
}