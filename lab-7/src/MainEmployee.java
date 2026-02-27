class Employee {
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }

    void calculateSalary() {
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeEmp extends Employee {
    int hoursWorked;
    static final double hourlyRate = 200;

    PartTimeEmp(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        salary = hoursWorked * hourlyRate;
    }

    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

class FullTimeEmp extends Employee {
    double bonus, deductions;

    FullTimeEmp(String name, double bonus, double deductions) {
        super(name);
        this.bonus = bonus;
        this.deductions = deductions;
    }

    void calculateSalary() {
        salary = 30000 + bonus - deductions;
    }

    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
    }
}

public class MainEmployee {
    public static void main(String[] args) {

        Employee e1 = new PartTimeEmp("Rohit", 50);
        e1.calculateSalary();
        e1.displayEmployeeDetails();

        Employee e2 = new FullTimeEmp("Simran", 5000, 2000);
        e2.calculateSalary();
        e2.displayEmployeeDetails();
    }
}