import java.util.*;
class FindTargetElement {

    public static boolean  findTargetElement(int [] arr,int target)
    {
           HashSet<Integer> set = new HashSet<>();

           for(int num : arr){
            set.add(num);
           }

           if(set.contains(target)){
                return true;
           }
           

           return false;
    }
       


    



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total size of array : ");
        int num = sc.nextInt();
        int []arr = new int[num];


        System.out.print("Enter the Elements : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();   
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        boolean result =  findTargetElement(arr,target);

        if(result==false){
            System.out.println("-1");
        }
        else{
            System.out.println("found");
        }

    }
}
