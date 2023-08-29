// method overload

package com.proj16;

public  class TestClass {

    public void Print() {
        System.out.println("Print method");
    }

    public void Print(String word1) {
        System.out.println("Print method + " + word1);
    }

    public void Print(String word1, String word2) {
        System.out.println("Print method + " + word1 + " + " + word2);
    }

    public void Print(String word1, char word2) {
        System.out.println("Print method + " + word1 + " + " + word2);
    }

}
