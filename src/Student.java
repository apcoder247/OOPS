import java.util.Scanner;

class Student {
    String sname;
    int marks[];
    int total;
    double avg;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        sname = sc.nextLine();

        marks = new int[5];
        total = 0;

        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        avg = total / 5.0;
    }

    void display() {
        System.out.println("Name: " + sname);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read();
            sc.nextLine();
        }

        System.out.println("\n--- Student Details ---");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
