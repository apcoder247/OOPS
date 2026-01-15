import java.util.Scanner;

public class Q5 {
    static long fact(long n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = myObj.nextLong();

        long result = fact(n);

        System.out.println("Factorial of " + n + " is: " + result);

}
}