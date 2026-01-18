import java.util.Scanner;

public class No3 {

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = num.nextInt();

        if(number > 0){
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");

        }else{
            System.out.println("Zero");
        }
    }
}
