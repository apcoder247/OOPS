import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = myObj.nextInt();

        String[] name = new String[n];
        double[] price = new double[n];
        int[] quantity = new int[n];

        System.out.println("Enter name, price and quantity for each item:");
        for(int i = 0; i < n; i++){
            name[i] = myObj.next();
            price[i] = myObj.nextDouble();
            quantity[i] = myObj.nextInt();
        }

        System.out.print("Enter product name to purchase: ");
        String p = myObj.next();

        System.out.print("Enter quantity required: ");
        int q = myObj.nextInt();

        double bill = 0;

        for(int i = 0; i < n; i++){
            if(name[i].equalsIgnoreCase(p)){
                bill = price[i] * q;
                break;
            }
        }

        System.out.println("Total Bill: Rs " + bill);
    }
}
