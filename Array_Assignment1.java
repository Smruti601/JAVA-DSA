
import java.util.Scanner;

class DuplicateElement {
        public static boolean  checkDuplicate(int []arr)
        {

            for (int i = 0; i< arr.length; i++) 
            {
                int temp = arr[i];
                for(int j = i+1 ; j<arr.length ; j++)
                {
                    if(temp == arr[j])
                    return true;
                }
            }

            return false;

        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total size of array : ");
        int num = sc.nextInt();
        int []arr = new int[num];
        System.out.print("Enter the Elements : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();   
        }

       boolean result =  checkDuplicate(arr);
       System.out.println(result);
    }
}
