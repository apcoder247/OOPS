import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = myObj.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = myObj.nextInt();
        }

        System.out.print("Enter steps to rotate: ");
        int k = myObj.nextInt();

        k = k % n; //if k>n

        System.out.print("Enter direction (L for left, R for right): ");
        char dir = myObj.next().charAt(0);

        if(dir == 'R' || dir == 'r'){
            for(int step = 0; step < k; step++){
                int temp = arr[n-1];
                for(int i = n-1; i > 0; i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = temp;
            }
        }
        else if(dir == 'L' || dir == 'l'){
            for(int step = 0; step < k; step++){
                int temp = arr[0];
                for(int i = 0; i < n-1; i++){
                    arr[i] = arr[i+1];
                }
                arr[n-1] = temp;
            }
        }
        else {
            System.out.println("Invalid direction!");
            return;
        }

        System.out.println("Rotated Array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
