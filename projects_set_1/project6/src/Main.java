// using arrays

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creating an array
        int[] array = new int[5];
        array[0] = 3;
        System.out.println(array[0]);

        int[] array2 = new int[] {2, 5, 0, 1};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println("\n");


        // filling the array
        Scanner scanner = new Scanner(System.in);
        int[] array3 = new int[3];
        System.out.println("Fill in the array: ");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = scanner.nextInt();
        }
        System.out.println();


        // two-dimensional array
        char[][] array4 = new char[2][2];

        char[][] array5 = new char[][] { {'a', 'b'}, {'c', 'd'} };
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
