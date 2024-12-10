import java.util.*;
class Tiffin
{
	public static boolean findMenu(String menuList[] , String select)
	{
		select = select.toLowerCase();
		for(int i = 0;i < menuList.length ; i++)
		{
			// if (select == menuList[i])
			// 	return true;
			// else
			// 	return false;

			if (select .equals(menuList[i]))
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		try{
			Scanner sc = new Scanner(System.in);

			System.out.println();

			System.out.println("Ama Tiffin Stall");
			System.out.println("=================");

			System.out.println();

			System.out.println("Idli");
			System.out.println("Aluchap");
			System.out.println("Bara");
			System.out.println("Upama");
			System.out.println("Halwa");
			System.out.println("Samosa");
			System.out.println("Puri");
			System.out.println("Dosa");


			System.out.println();
			
			System.out.println("=================");

			String[] menuList = {"idli","aluchap","bara","upama","samosa","halwa","puri","dosa"};
			System.out.println();
			System.out.print ("Malike kn khaiba : ");

			String select = sc.next();
		   
			boolean Plate = findMenu(menuList,select);

			if (Plate == true) 
			{
				System.out.println("Khaiba asigala ...");	
			}
			else {
				System.out.println("Aga chhaka dekha...");
			}

		}

			catch(Exception e)
			{
				System.out.println("Jalakhia dokan re pua eita");
			}
			
	}
	
}