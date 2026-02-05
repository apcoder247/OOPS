class Student {
    String sname;
    int total;
    double avg;

    Student() {
        sname = "Unknown";
        total = 0;
        avg = 0;
    }

    Student(String n, int t, double a) {
        sname = n;
        total = t;
        avg = a;
    }

    void display() {
        System.out.println("Name: " + sname);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 400, 80.0);

        s1.display();
        s2.display();
    }
}
