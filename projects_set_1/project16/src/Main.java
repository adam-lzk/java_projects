// method overload

import com.proj16.*;

public class Main {
    public static void main(String[] args) {

        TestClass testclass = new TestClass();

        testclass.Print();
        testclass.Print("word1");
        testclass.Print("word1", "word2");
        testclass.Print("word1", 'w');

    }
}
