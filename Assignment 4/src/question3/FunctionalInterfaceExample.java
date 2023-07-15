package question3;

import java.util.function.Function;

public class FunctionalInterfaceExample {

  public static void main(String[] args) {
    // Create a function that takes a string as input and returns the length of the string as output.
    Function<String, Integer> lengthOfString = (str) -> {
      // The lambda expression syntax is a concise way to create a Function instance.
      // The lambda expression takes a string as input and returns the length of the string as output.
      return str.length();
    };

    // Call the apply() method on the lengthOfString variable.
    // The apply() method takes a string as input and returns the length of the string as output.
    int length = lengthOfString.apply("Hello, world!");

    // Print the length of the string.
    System.out.println(length);
  }
}
