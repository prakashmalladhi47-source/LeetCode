class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if(n<=2) return 0;
        byte[] arr = new byte[n];

        count = n-2;
        for(int i=2; i*i<n; i++){
            if(arr[i]==0){
                for(int j=i*i; j<n; j+=i){
                    if(arr[j]==0){
                       arr[j]=1;
                       count--;
                    }
                }
            }
        }   
        return count; 
    }
}