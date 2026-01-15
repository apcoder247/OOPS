import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int r = myObj.nextInt();
        int c = myObj.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements of 2D-array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = myObj.nextInt();
            }
        }
        int sum_total=0;
        int sum_diagonal=0;
        System.out.println("Array elements are: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum_total+=arr[i][j];
                System.out.print(arr[i][j]+"\t");
            }
        }
        for (int i = 0; i < r; i++)
                sum_diagonal+=arr[i][i];
        int sum_non_d=sum_total-sum_diagonal;
        System.out.println();
        System.out.println("Sum of non diagonal elements are:- "+sum_non_d);


    }
}


