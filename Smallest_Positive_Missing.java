class Solution {
    // Function to find the smallest positive number missing from the array.
    public static int missingNumber(int[] arr) {
       int n = arr.length;

       for(int i = 0 ; i< n ; i++)
       {
           while(arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i]-1])
           {
               int correctIndex = arr[i]-1;
               int temp = arr[i];
               arr[i] = arr[correctIndex];
               arr[correctIndex] = temp;
               
           }
           
       }
       
       for(int i = 1 ; i <= n ;i++)
       {
           if(i != arr[i-1])
           return i;
       }
       return n+1;
        
    }
    
    public static void main(String args[]){
        int [] arr = {2,-3,4,1,1,7};
        int res = missingNumber(arr);
        System.out.println(res);
    }
}
 {
    
}
