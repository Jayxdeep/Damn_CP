package cape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {//printing thr traversal spiral matrix first in top then in right then bottom then left
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        List<Integer> res=spiralOrder(mat);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i) + " ");
        }

    }
    public static List<Integer> spiralOrder(int[][] mat){
        List<Integer> ans=new ArrayList<>();
        int m=mat.length;int n=mat[0].length;
        int top=0;int bottom=m-1;int left=0;int right=n-1;
        while(top<=bottom && left<=right){//top and bottom logic for traversing
            for(int i=left;i<=right;i++){
                ans.add(mat[top][i]);//checks for the spiral mat and adds in the list
            }top++;
            //logic for right side of mat
            for(int i=top;i<=bottom;i++){
                ans.add(mat[i][right]);
            }right--;   //-- because the values are decreasing
            if(top<=bottom){ //
                for(int i=right;i>=left;i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
            
        }
        return ans;
    }
}
