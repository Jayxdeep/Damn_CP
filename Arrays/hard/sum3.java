package Arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {
    public static void main(String[] args) {
    }
    public static List<List<Integer>> sum3(int nums[],int n){
        List<List<Integer>> res=new ArrayList<>();
        // int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(j<k){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(temp);
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                }
            }
        }
        return res;
    }
}
