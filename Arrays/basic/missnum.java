package basic;

public class missnum {//hashing concept
    public static int missingnums(int []a,int N){
        int hash[]=new int[N+1];
        for(int i=0;i<N-1;i++){
            hash[a[i]]++;
        }
        for(int i=1;i<N;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N=5;
        int a[]={1,2,4,5};
        int ans=missingnums(a, N);
        System.out.println("The missing number are:"+ ans);
    }
}
// class sol{//optimal [sum approach]
//     public int missingnums(int nums[]){
//         int n=nums.length;
//         int sum=n*(n+1)/2;
//         int s2=0;
//         for(int i=0;i<n;i++){
//             s2+=nums[i];
//         }
//         return sum-s2;

//         //optimal[xor approach] laterr
//         int ans=0;
//         for(int i=1;i<=n;i++){
//             ans=ans^i;
//         }
//         for(int i=0;i<nums.length;i++){
//             ans=ans^nums[i];
//         }
//         return ans;
//     }
// }