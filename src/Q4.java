import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of n for n x n square matrix: ");
        int n = myObj.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements of 2D-array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = myObj.nextInt();
            }
        }
        int sum_non_pd = 0;
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Non Principal diagonal elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(arr[i][j] + "\t");
                    sum_non_pd += arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of non diagonal elements are:- " + sum_non_pd);

    }
    }




