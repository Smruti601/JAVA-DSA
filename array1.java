//wap to enter a number of students name , into an array and display
import java.util.*;
class Student
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of student : ");
		int n = sc.nextInt();

		String[] arr = new String[n];
		for(int i = 0; i< arr.length ; i++)
		{
			System.out.print("Enter "+(i+1)+" student name : ");
			arr[i] = sc.next();
		} 
		System.out.println("===================");
		for(String p : arr)
		{
			
			System.out.println("Student name : "+p+"  ");
		}

	}
}