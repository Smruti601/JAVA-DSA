class Solution {
    // Function to find maximum product subarray
   static int maxProduct(int[] arr) {
       
       int n = arr.length;
       int maxProd = Integer.MIN_VALUE;
       int lefttoRight = 1 ;
       int righttoLeft = 1 ;
       
       for (int i = 0 ; i< n ; i++)
       {
            if(lefttoRight == 0)
                lefttoRight = 1 ;
            if(righttoLeft == 0)
                righttoLeft = 1 ;
                
            lefttoRight *= arr[i];
            
            int j = n-i-1;
            righttoLeft *= arr[j];
            
            maxProd = Math.max(lefttoRight ,Math.max(righttoLeft , maxProd));
            
       }
       
       return maxProd;
    }
    public static void main(String args[])
    {
        int [] arr = {-2,6,-3,-10,0 , 2};
        System.out.println(maxProduct(arr));
    }
}