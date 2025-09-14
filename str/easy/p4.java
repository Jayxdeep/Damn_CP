package str.easy;
//valid parenthesis check 
public class p4 {
    public static boolean isPalin(String s){
        int i=0,j=s.length()-1;
        //skiping the non numeric numbers from left
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            //skiping from right
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            //checks for ignoring cases
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String wrd="A man, a plan, a canal: Panama";
        if(isPalin(wrd)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}
