import  java.util.*;
public class Binary_Search 
{
    public static int binarySearch(int[] numbers, int key)
    {
        int start = 0,end = numbers.length-1;
        
        while(start <= end)
        {
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid]> key){
                end = mid - 1;
            }
            else{
                start = mid+1;
              
            }
        }
        return 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the Number of Elements of Array : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        //input the elements of the array

        for (int i = 0 ; i< numbers.length;i++)
        {
        System.out.print("Enter the "+(i+1)+" Element of the array : ");
        numbers[i] = sc.nextInt();
        }

        //display of elements of array 
         System.out.print("Elemets of the Number[] : ");
        for ( int j  = 0; j  < numbers.length; j++) 
        {
               System.out.print(numbers[j]+" ");
        }
        System.out.println();

        System.out.print("Enter the Key element to Search : ");
        int key = sc.nextInt();

       int result = binarySearch(numbers, key);
       if(result == 0)
       System.out.println("Element is not present !!!");
       else{
       System.out.println("Element present at "+ result +" Position...");
       System.out.println("Element present at "+ (result-1) +" Index...");
       }
       sc.close();
}
    
}
