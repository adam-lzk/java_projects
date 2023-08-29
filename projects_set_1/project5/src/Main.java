// calculator

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the first number: ");
        float numb1 = scan.nextFloat();

        System.out.print("enter the second number: ");
        float numb2 = scan.nextFloat();

        System.out.print("enter the operator: ");
        String operator = scan.nextLine();
        operator = scan.nextLine();

        switch (operator) {
            case "+":
                System.out.println("result is " + (numb1 + numb2));
                break;
            case "-":
                System.out.println("result is " + (numb1 - numb2));
                break;
            case "*":
                System.out.println("result is " + (numb1 * numb2));
                break;
            case "/":
                System.out.println("result is " + (numb1 / numb2));
                break;
            default:
                System.out.println("the operator is not defined");
                break;
        }
    }
}
