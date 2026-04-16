import java.util.* ;
public class insertElement {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 4; 
        arr[1] = 5;
        arr[2] = 20;
        arr[3] = 12;
        arr[4] = 10;
        arr[5] = 18;
        arr[6] = 96;

        int n = 7 ;
        
        for (int i =0; i<arr.length ; i++)
            System.out.print(arr[i] + ",");
        System.out.println("");
      
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value x = ");
        int x = sc.nextInt();
        System.out.print("Enter the value at index = ");
        int index = sc.nextInt();

        // int x = 40;
        // int index = 3;

        for(int i = n ; i>index ; i--)

            arr[i] = arr[i-1];
            arr[index] = x ;

            for (int i = 0; i<arr.length ; i++)
            System.out.print(arr[i] + ",");
        System.out.println(" ");

    }
    
}
