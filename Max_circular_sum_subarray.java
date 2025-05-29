class Solution {
    public static int circularSubarraySum(int arr[]) {
       int totalsum = arr[0];
       int currMaxSum = arr[0] , currMinSum = arr[0] ;
       int maxSum = arr[0] , minSum = arr[0];
       
       for(int i = 1 ; i < arr.length ; i++){
           
           currMaxSum = Math.max(currMaxSum+arr[i], arr[i]);
           maxSum = Math.max(currMaxSum , maxSum);
           
           currMinSum = Math.min(currMinSum+arr[i], arr[i]);
           minSum = Math.min(currMinSum , minSum);
           
           totalsum += arr[i];
       }
       
       int normalSum = maxSum;
       int circularSum = totalsum - minSum;
       
       if(minSum == totalsum)
            return normalSum;
            
            
    return Math.max(normalSum,circularSum) ;
    }
    
    public static void main(String args[]){
        int []arr = {8,-8,9,-9,10,-11,12};
        int res = circularSubarraySum(arr);
        System.out.println(res);
    }
}
