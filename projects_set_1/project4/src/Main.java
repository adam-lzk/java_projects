// using the Scanner class

import java.util.Scanner;  // for using Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // creating an object of the Scanner class to receive data from the user

        System.out.print("\nEnter your name: ");
        String username = scan.nextLine();  // the same as  cin >> (string)
        System.out.println("Hi, " + username + ". How old are you?");
        int age = scan.nextInt();  // the same as  cin >> (int)

        if (username.equals("Adam") && age == 18)  // string comparison
            System.out.println(":)");
    }
}
