
import java.util.Scanner;

public class pairs_in_array 
{
    public static void printPairs(int numbers[])
    {
        for (int i = 0; i < numbers.length; i++) 
        {
            int curr = numbers[i];
            for(int j = i+1 ; j < numbers.length ;j++)
            {
                System.out.print("( " + curr + " , " + numbers[j] + " )");
            }  
            System.out.println(); 
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter elements : ");
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = sc.nextInt();
        }

        printPairs(numbers);
    }
}
