class Smallest
{
	static int getSmallest(int[] number )
	{
		int smallest = number[0];
		for(int n = 0 ; n< number.length ; n++)
		{
			if(smallest > number[n])
			{
				smallest = number[n];
			}
		}
		return smallest;
	}

	public static void main(String[] args) 
	{
		int[] number = {1,2,63,-15,63,43,23};	
		for(int i = 0; i<number.length ; i++)
		{
			System.out.print(number[i]+" ");
		}

		System.out.println();
		System.out.println("Largest Integer tn the Array : " + getSmallest(number));
	}
}