import java.util.*;
class Linear_search
{
	public static int Linear_search(int arr[] , int key)
	{
		for (int i = 0 ; i<arr.length ; i++)
		{
			if(key == arr[i])
			{
				return 1;
			}
			// else
			// 	return 0;
		}

		return 0;
	}

    public static void main(String[] args) 
    {
    	// int[] arr = {10,20,30,40,50,60,07,8,89,80};
    	// int key = 440;
    	//========================================================================

    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the size of array : ");
    	int size = sc.nextInt();

    	int[] arr = new int[size];
    	//enter values for array
    	for(int i = 0 ; i < size ; i++)
    	{
    		System.out.print("Enter the "+(i+1)+" place element : ");
    		arr[i] = sc.nextInt();
    	}

    	//display the array 
    	System.out.print("Elemets of the Array is : ");
    	for(int j = 0 ;j < arr.length ; j++)
    	{
    		System.out.print(arr[j]+" ");
    	}
    	System.out.println();


    	System.out.print("Enter the key to search : ");
    	int key = sc.nextInt();


    	int result = Linear_search(arr,key);

    	if(result == 1)
    	System.out.println("found");
    	else
    	System.out.println("not found");	
    }
}