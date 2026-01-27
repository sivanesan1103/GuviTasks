package No2;
import java.util.Scanner;

public class productmain {

    // Method to calculate total amount
    static double totalAmount(product[] products) {
        double total = 0;

        for (int i = 0; i < products.length; i++) {
            total = total + (products[i].price * products[i].quantity);
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        product[] products = new product[5];

        // a) Accept 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));

            System.out.print("Enter PID: ");
            int pid = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new product(pid, price, quantity);
        }


        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("PID of product with highest price: " + maxPid);


        double total = totalAmount(products);
        System.out.println("Total amount spent on all products: " + total);
    }
}
