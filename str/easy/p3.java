package str.easy;

public class p3 {
    public static void main(String[] args) {
        String s="INTEGER";
        String t="NTEGERI";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s,String t){//frequency counting way 
        if(s.length()!=t.length()){
            return false;
        }
        int freq[]=new int [26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)- 'A']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)- 'A']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
