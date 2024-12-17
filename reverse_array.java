
import java.util.Scanner;

public class reverse_array 
{    
    public static void reverse(int[] numbers) 
    {

        int first = 0 , last = numbers.length-1 ;

        while(first < last)
        {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
        System.out.print("After reverse : ");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print(numbers[i]+" ");    
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

        reverse(numbers);
    }
}
