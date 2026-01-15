import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the 9-digit reg no: ");
        long reg = myObj.nextLong();
        int n = (int) reg / 10000000;
        int year = 2000 + n;
        System.out.println("Year of joining is: " + year);

    }
}


