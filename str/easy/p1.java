package str.easy;

public class p1 { //remove the outer parenthesis
    public static void main(String[] args) {
        String s="(())(()())";
        System.out.println(removeOuterString(s));
    }
    public static String removeOuterString(String s){
        StringBuilder ans=new StringBuilder();
        int bal=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(bal>0){
                    ans.append(ch);
                }
                bal++;
            }
            else{
                bal--;
                if(bal>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
