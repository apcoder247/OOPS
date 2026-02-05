class Employee {
    String ename;
    int eid;
    double salary;

    Employee() {
        ename = "Not Assigned";
        eid = 0;
        salary = 0;
    }

    Employee(String n, int i, double s) {
        ename = n;
        eid = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + ename);
        System.out.println("ID: " + eid);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 101, 25000);

        e1.display();
        e2.display();
    }
}
