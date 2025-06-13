public class Selection_Sort {

    public static void selection_Sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minPos = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[minPos]) // if(arr[j] > arr[minPos]) for decreasing order
                {
                    minPos = j;
            }   
        }
         int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

    }
}
    
    public static void main(String[] args) {
        int [] arr = {2,5,3,1,4};
        selection_Sort(arr);
        for(int n : arr){
            System.out.print(n+ " ");
        }
    }
}
