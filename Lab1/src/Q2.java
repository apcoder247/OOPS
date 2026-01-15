import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter first no:-");
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        System.out.println("Enter second no:-");
        int b = myObj.nextInt();
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        System.out.println("Sum using bitwise operator is " + a);
        if ((a & 1) == 1) {
            System.out.println("Sum is Odd");
        } else {
            System.out.println("Sum is Even");
        }
    }
}





