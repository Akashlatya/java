public class LRotation {
    public static void main(String[] args) {
        int tmp;
        int arr[] = { 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 13, 4, 5 };
        
        for(int x : arr)
            System.out.print(x+",");
        System.out.println("");
        tmp = arr[0];

        for(int i =1 ; i< arr.length ; i++){
            arr[i-1] = arr[i] ;
        }
        arr[arr.length - 1] = tmp ;
         for(int x : arr)
            System.out.print(x+",");
        System.out.print("");

        }

    }   
