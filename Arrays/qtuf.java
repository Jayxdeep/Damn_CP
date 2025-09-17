import java.util.*;
class solution{//quick sort
    static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high-1 && arr[i]<=pivot){
                i++;
            }
            while(j>=low+1 && arr[j]>pivot){
                j--;
            }
            if(i<j){//swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap arr[low] and arr[j]
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    static void quicksort(int arr[],int low,int high){if(low<high){
        int pindex=partition(arr, low, high);
        quicksort(arr, low, pindex-1);
        quicksort(arr, pindex+1, high);
         }
    }   
}



public class qtuf {
    public static void main(String[] args) {
        int arr[]={9,4,7,6,3,1,5};
        int n=arr.length;
        System.out.println("BEfore quick sort");
        System.out.println(Arrays.toString(arr));
        solution.quicksort(arr,0,n-1);
        System.out.println("After quick sort");
        System.out.println(Arrays.toString(arr));
    }
}
