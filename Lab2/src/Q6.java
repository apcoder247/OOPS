import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int[] units = new int[7];
        int total = 0;

        System.out.println("Enter electricity units for 7 days:");
        for (int i = 0; i < 7; i++) {
            units[i] = myObj.nextInt();
            total += units[i];
        }

        int choice;

        if (total <= 100)
            choice = 1;
        else if (total <= 200)
            choice = 2;
        else
            choice = 3;

        int price = 0;
        switch (choice) {
            case 1:
                price = 7;
                break;
            case 2:
                price = 8;
                break;
            case 3:
                price = 10;
                break;
            default:
                System.out.println("Invalid choice!");
        }

        int bill = total * price;

        System.out.println("Total Consumption: " + total + " units");

        System.out.println("Total Bill Amount: Rs. " + bill);
    }
}