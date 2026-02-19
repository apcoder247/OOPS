import java.util.*;

public class Employee{

    String eName;
    double salary;

    Employee(String eName, double salary) {
        this.eName = eName;
        this.salary = salary;
    }

    String formatEmployeeName() {
        String[] words = eName.toLowerCase().split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0))
                    + w.substring(1) + " ";
        }
        return result.trim();
    }

    String generateEmail() {
        String[] parts = eName.toLowerCase().split(" ");

        if (parts.length >= 2)
            return parts[0].charAt(0) + parts[1] + "@example.com";
        else
            return parts[0] + "@example.com";
    }

    void display() {
        System.out.println("Name: " + formatEmployeeName());
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + generateEmail());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(name, sal);
        }

        for (Employee e : emp) {
            e.display();
            System.out.println();
        }
    }
}