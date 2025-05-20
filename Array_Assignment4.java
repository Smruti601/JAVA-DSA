 import java.util.*;
 class TrapprdRainWater_Assign {

    public static int trappedWater(int[] heights){
        int savedWater = 0 ;
        int n = heights.length;
        //left boundary
            int[] leftMax = new int[n];
            leftMax[0] = heights[0];
            for (int i = 1; i < n; i++){
                leftMax[i] = Math.max(heights[i],leftMax[i-1]);                
            }
        //right boundary
            int[] rightMax = new int[n];
            rightMax[n-1] = heights[n-1];

            for(int j = n-2 ; j>= 0;j--)
            {
                rightMax[j] = Math.max( heights[j],rightMax[j+1]);
            }
        //loop
                for (int i = 0; i < n; i++) {
                    int waterLevel= Math.min(leftMax[i],rightMax[i] );
                    savedWater += waterLevel - heights[i];
                    
                }

        return savedWater ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total size of array : ");
        int num = sc.nextInt();
        int []heights = new int[num];


        System.out.print("Enter the Bar Heights : ");
        for (int i = 0; i < num; i++) {
            heights[i] = sc.nextInt();   
        }

        int water = trappedWater(heights);
        System.out.println(water);
    }
    
}
