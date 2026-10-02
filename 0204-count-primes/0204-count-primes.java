class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if(n<=2) return 0;
        int[] arr = new int[n];

        for(int i=2; i<n; i++)
            arr[i] = 1;
        count = n-2;
        for(int i=2; i*i<n; i++){
            if(arr[i]==1){
                for(int j=i*i; j<n; j+=i){
                    if(arr[j]==1){
                       arr[j]=0;
                       count--;
                    }
                }
            }
        }   
        return count; 
    }
}