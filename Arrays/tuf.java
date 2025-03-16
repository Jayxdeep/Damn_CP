import java.util.*;
class merger{
    private static void merge(int arr[],int low,int mid,int high){
        int [] temp=new int [high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }else{
                temp[k++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=high){
            temp[k++]=arr[right++];
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
    public static void mergeSort(int []arr,int low,int high) {
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);
    }
}
public class tuf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int arr[]={9,4,7,6,3,1,5};
        System.out.println("Before sorting array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        merger.mergeSort(arr,0,n-1);
        System.out.println("After sorting array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}