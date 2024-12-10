class SecondLargest
{
	static int getSecondLargest(int[] number )
	{
		int seclargest = number[0];
		for(int n = 0 ; n< number.length ; n++)
		{
			if(seclargest < number[n])
			{
				largest = number[n];
			}
		}
		return largest;
	}

	public static void main(String[] args) 
	{
		int[] number = {1,2,63,5,63,43,23};	
		for(int i = 0; i<number.length ; i++)
		{
			System.out.print(number[i]+" ");
		}

		System.out.println();
		System.out.println("Second Largest Integer tn the Array : " + getSecondLargest(number));
	}
}