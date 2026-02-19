import java.util.*;

public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    String extractInitials() {
        String[] words = name.split(" ");
        String initials = "";

        for (String w : words) {
            initials += Character.toUpperCase(w.charAt(0));
        }
        return initials;
    }

    String removeWhitespace() {
        return name.replace(" ", "");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Initials: " + extractInitials());
        System.out.println("Without Spaces: " + removeWhitespace());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students[i] = new Student(sc.nextLine());
        }

        for (Student s : students) {
            s.display();
            System.out.println();
        }

        Arrays.sort(students,
                (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s.name);
        }

        System.out.print("Enter substring to search: ");
        String sub = sc.nextLine();

        for (Student s : students) {
            if (s.name.toLowerCase().contains(sub.toLowerCase())) {
                System.out.println(s.name);
            }
        }
    }
}