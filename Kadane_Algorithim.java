class Solution {
    static int maxSubarraySum(int[] arr) {
       int maxEnding = arr[0];
       int res = arr[0];
       for (int i = 1;i < arr.length ; i++ ){
           maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
           res = Math.max(res , maxEnding);
       }

    return res;        
    }
    public static void main (String []args){
        int [] arr = {5,4,1,7,8};
        System.out.println(maxSubarraySum(arr));
    }
}
