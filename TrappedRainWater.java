import java.util.Scanner;

public class TrappedRainWater {

    static int trappedRainWater(int[] height)
    {
        int n = height.length;
        //leftMax boundary
            int[] leftMax = new int[n];
            leftMax[0] = height[0];
            for(int i  = 1 ;i<n;i++)
            {
                leftMax[i] = Math.max(height[i], leftMax[i-1]);
            }

        //rightMax boundary
         int[] rightMax = new int[n];
         rightMax[n-1] = height[n-1];
         for(int i = n-2; i>= 0 ;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
           }
        //loop
                int trappedWater = 0;

        for(int i=0;i<n;i++)
        {
                int waterLevel = Math.min(leftMax[i],rightMax[i]);
                trappedWater += waterLevel-height[i];
        }

         //important :
        //The Width of each bar is 1 unit
        //or you can apply the formula 
        //========================================

        //TrappedWater = (WaterLevel - BarLevel)*Width;



        return trappedWater;
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of bars : ");
		int n = sc.nextInt();

		int[] height = new int[n];
		for(int i = 0; i< height.length ; i++)
		{
			System.out.print("Enter "+(i+1)+" bar height : ");
			height[i] = sc.nextInt();
		}  
        //important :
        //The Width of each bar is 1 unit
        //or you can apply the formula 
        //========================================

        //TrappedWater = (WaterLevel - BarLevel)*Width;


        int Water = trappedRainWater(height);
        System.out.println("The total water is stored : "+Water+" unit");
    }
}
