package str.easy;

import java.util.Arrays;

public class p5 { //longest common prefix
    public static void main(String[] args) {
        String []ip={"flower","flows","flker","flight"};
        System.out.println("The longest prefix is : '" + longestCommonPrefix(ip) + "'");
        String[]ip2={"dog","cat","rat"};
        System.out.println("The longest prefix is : '" + longestCommonPrefix(ip2) + "'");
    }
    public static String longestCommonPrefix(String strs[]){
        StringBuilder res=new StringBuilder();
        Arrays.sort(strs);//sort the string as per aplha
        //start comparing character by character logic
        char[]frst=strs[0].toCharArray();
        char[]lst=strs[strs.length-1].toCharArray();
        for(int i=0;i<strs.length-1;i++){
            if(frst[i]!=lst[i]){//here i compared with first charact of str to last chara of str
                break;
            }
            res.append(frst[i]);
        }
        return res.toString();
    }
}
