// Java Program to Implement User
// Defined Jagged Array
import java.util.Scanner;

// Main Class
class JaggedArray {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
      	System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scan.nextInt();
        
        // Declare the jagged array
        int[][] jaggedArray = new int[numberOfArrays][];
        
        // Allocate memory to each sub-array
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scan.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
        }
        
        // Initialize the elements of each sub-array
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
          
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scan.nextInt();
            }
        }
        
        // Print the elements of the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < numberOfArrays; i++) {
            
          	for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}