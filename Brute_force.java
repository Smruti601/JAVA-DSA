import java.util.Scanner;

public class Brute_force 
{
    

    static void maxSubarraySum(int numbers[] )
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int start = 0 ; start < numbers.length  ; start++)
        {
            for(int end = start ; end < numbers.length ; end++)
            {
                currSum = 0;
                for(int k = start ; k <= end ; k++)
                {
                    //sum of Subarray
                    currSum += numbers[k]; 
                }
                System.out.println("Sum of each sub array  :  " + currSum);
                if(currSum > maxSum)
                    maxSum=currSum;
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

        maxSubarraySum(numbers);
    }    
}
