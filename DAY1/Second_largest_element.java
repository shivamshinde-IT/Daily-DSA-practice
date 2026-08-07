class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
             if(arr[i]>max) {
                 max=arr[i];
             }
        }
        for(int i=0; i<n; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
          
        }
        if (smax == Integer.MIN_VALUE) {
            return -1;
        }
       
        return smax;
    }
    
}
