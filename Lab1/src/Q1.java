import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        System.out.println("Enter no of hrs:-");
        Scanner myObj = new Scanner(System.in);
        double hrs = myObj.nextDouble();
        System.out.println("Enter hourly rate:-");
        double rate = myObj.nextDouble();
        double s=0;
        if (hrs > 0 && hrs <= 40)
            s = hrs * rate;
        else if (hrs > 40)
            s = 40 * rate + (hrs - 40) * rate * 1.5;
        else
            System.out.println("Invalid");
        System.out.println("SALARY OF THE EMPLOYEE IS: " + s);
        myObj.close();
    }

}
