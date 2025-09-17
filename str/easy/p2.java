package str.easy;

public class p2 {//reversing the words in string
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(isReverse(s));
    }
    public static String isReverse(String s){
        String str[]=s.trim().split("\\s+");
        String out="";
        for(int i=str.length-1;i>0;i--){
            out+=str[i]+" ";
        }
        return out+str[0];
    }
}
