// using functions

public class Main {

    public static void PrintArray(int[] arr) {
        for (int i : arr)
            System.out.println(i);

        System.out.println();
    }


    public static int SumOfElements(int[] arr) {
        int sum = 0;

        for (int i : arr)
            sum += i;

        return sum;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {6, 4, 2};

        PrintArray(arr);

        System.out.println(SumOfElements(arr) + "\n");


        int numb = 729;
        String str = String.valueOf(numb);  // = string(numb) - converting int to String -- 9 -> "9"
        System.out.println(str);
    }

}
