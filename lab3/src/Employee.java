import java.util.Scanner;

class Employee {
    String ename;
    int eid;
    double basic, da, gross, it, net;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        ename = sc.nextLine();
        System.out.print("Enter ID: ");
        eid = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    void compute_net_sal() {
        da = 0.52 * basic;
        gross = basic + da;
        it = 0.30 * gross;
        net = gross - it;
    }

    void display() {
        System.out.println("\nEmployee: " + ename);
        System.out.println("Net Salary: " + net);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read();
            emp[i].compute_net_sal();
        }

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}
