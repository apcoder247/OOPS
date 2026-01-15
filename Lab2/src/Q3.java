import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter dob in yyyy format: ");
        int dob = myObj.nextInt();
        System.out.println("Enter age at time of joining: ");
        int age_j = myObj.nextInt();
        int year_r = dob + age_j + 60;
        System.out.println("Year of retirement is: " + year_r);
    }
}