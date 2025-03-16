class sort3{
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println("Original array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertion(arr, n);
    }
    public static void insertion(int arr[],int n){
        for(int i=1;i<n;i++)
        
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}