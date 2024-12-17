import java.util.Scanner;

public class subarray 
{
    public static void printSubArray(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i++)
        {
            for(int j = i ; j < numbers.length;j++)
            {                
                for(int k = i ; k <= j ; k++ )
                {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int num = sc.nextInt();
        
        int[] numbers = new int[num];
        System.out.print("Enter the Array elements : ");
        for(int i = 0 ; i < num ; i++)
        {
            numbers[i] = sc.nextInt(); 
        }
        printSubArray(numbers);

    }    
}
