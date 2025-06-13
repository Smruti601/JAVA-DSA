class BubbleSort{
    public static void bubbleSort(int []arr){
        boolean flag ;
        for(int i = 0 ; i < arr.length ;i++)
        {
            flag = false;
            for(int j = 0 ; j < arr.length -1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }
            if(!flag) break;
        }
    }

        
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,4};
        bubbleSort(arr);

        
        for(int n : arr){
            System.out.print(n + " ");
        }

    }
}