public class Side_All_Zeros {

    public void side_zeros(int[]arr){
            int count =  0;
            int temp = 0 ;
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] != 0){
                    temp = arr[i];
                    arr[i]=arr[count];
                    arr[count] = temp;

                    count++;
                }
            }
            for(int i : arr)
            {
                System.out.print(i+" ");
            }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,0,4,3,0,5,0};
         for(int i : arr)
            {
                System.out.print(i+" ");
            }
        System.out.println();
        Side_All_Zeros ob = new Side_All_Zeros();
        ob.side_zeros(arr);
    }
}
