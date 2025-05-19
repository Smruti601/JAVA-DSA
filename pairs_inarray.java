
import java.util.Scanner;

public class pairs_inarray {

    public static void pairs_inarray(int [] numbers){

        for (int i = 0; i < numbers.length; i++) {
            int temp=  numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+temp+","+numbers[j]+")");
            }

            System.out.println();
            
        }

    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of an array : ");
        n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter numbers : ");
        for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();   
        }
        System.out.print("[ ");
        for(int m : numbers)
        {
            System.out.print(m+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();


        System.out.println("Possible pairs are : ");
        pairs_inarray(numbers);
    }

 
    
}
