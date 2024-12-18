import java.util.Scanner;

public class prefix_sum 
{
    static void maxSubarraySum(int[] numbers)
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix_array = new int[numbers.length];
        prefix_array[0] = numbers[0];

        for (int i = 1 ; i < prefix_array.length ; i++)
        {
            prefix_array[i] = prefix_array[i-1]+numbers[i] ; 
        }
        // for (int obj : prefix_array) 
        // {
        //     System.out.print(obj+" ");
        // }

        for(int start = 0 ; start < numbers.length  ; start++)
        {
            for(int end = start ; end < numbers.length ; end++)
            {
                
               currSum = start == 0 ? prefix_array[end] : prefix_array[end]-prefix_array[start-1];

               if(maxSum < currSum)
               maxSum = currSum;
            }
        }
        System.out.println("=======================================");
        System.out.println("Max Subarray Sum = "+ maxSum);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of array : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter array elements : ");
        for(int i = 0 ; i < numbers.length ; i++ )
        {
            numbers[i] = sc.nextInt();
        }
        // int[] numbers = {1 ,-2 , 6 , -1,3};
        maxSubarraySum(numbers);

    }
}
