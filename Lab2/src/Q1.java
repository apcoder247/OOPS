import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the distance covered by taxi in kms:-");
        int d=myObj.nextInt();
        double fare=0;
        if (d>0 && d<=5)
            fare=d*10;
        else if (d>5 && d<=20)
            fare=5*10+(d-5)*8;
        else if (d>20 && d<=45)
            fare=5*10+15*8+(d-20)*5;
        System.out.println("The total fare is: "+fare);
        myObj.close();
    }
}
