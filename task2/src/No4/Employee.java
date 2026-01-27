package No4;

class Employee extends Person {

    int employeeID;
    double salary;


    Employee(String name, int age, int employeeID, double salary) {


        super(name, age);

        this.employeeID = employeeID;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}