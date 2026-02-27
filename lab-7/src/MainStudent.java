class Student {
    String name;
    int m1, m2, m3;
    double total, average;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void compute() {
        total = m1 + m2 + m3;
        average = total / 3;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

class ScienceStudent extends Student {
    int practicalMarks;

    ScienceStudent(String name, int m1, int m2, int m3, int practicalMarks) {
        super(name, m1, m2, m3);
        this.practicalMarks = practicalMarks;
    }

    void compute() {
        total = m1 + m2 + m3 + practicalMarks;
        average = total / 4;
    }

    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

class ArtsStudent extends Student {
    String electiveSubject;

    ArtsStudent(String name, int m1, int m2, int m3, String electiveSubject) {
        super(name, m1, m2, m3);
        this.electiveSubject = electiveSubject;
    }

    void display() {
        super.display();
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class MainStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 70, 80, 90);
        s1.compute();
        s1.display();

        Student s2 = new ScienceStudent("Aman", 75, 85, 80, 95);
        s2.compute();
        s2.display();

        Student s3 = new ArtsStudent("Neha", 65, 75, 70, "History");
        s3.compute();
        s3.display();
    }
}