class Sort{//selection sort
    public static void sort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
       int arr[]={5,42,31,21,1,12};
       sort(arr);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}