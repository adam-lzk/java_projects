// using collections ArrayList and LinkedList

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();  /* java collection
                                                            using collections harms program performance - increases execution time
                                                            but it's much more convenient than using arrays */
        numbers.add(5);
        numbers.add(7);

        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));

        System.out.println();



        numbers.add(1, 3);  // put the element 3 in the 1st position

        for (Integer el : numbers)
            System.out.println(el);

        System.out.println();



        numbers.remove(2);

        for (Integer el : numbers)
            System.out.println(el);



        numbers.clear();

        for (Integer el : numbers)
            System.out.println(el);

        System.out.println();



        LinkedList<Float> numbers2 =  new LinkedList<>();

        numbers2.add(5.6f);
        // .remove .get .clean

        for (Float el : numbers2)
            System.out.println(el);
    }
}
