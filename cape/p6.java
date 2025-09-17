package cape;

import java.util.HashMap;
// import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
//freq count problem
public class p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }else{
                freq.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer>e:freq.entrySet()){
            System.out.println(e.getKey()+ " occurs " + e.getValue() + " times" );
        }
        sc.close();
    }
}
