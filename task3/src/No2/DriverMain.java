package No2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(eid, name, salary);
        emp.calcTax();


        System.out.print("\nEnter Product ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product prod = new Product(pid, price, qty);
        prod.calcTax();

        sc.close();
    }
}