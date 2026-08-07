class Solution {

    public int missingNum(int arr[]) {

     long n=arr.length+1;

     long firstsum=n*(n+1)/2;

     long secondsum=0;

     for(int ele:arr) {
         secondsum+=ele;
     }

     return (int)(firstsum-secondsum);

        

    }

}
