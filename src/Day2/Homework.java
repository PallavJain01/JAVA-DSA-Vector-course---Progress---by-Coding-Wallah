package src.Day2;

public class Homework {

  /*
   * Swap values of two numbers with/without using third variable
   */
  public static class SwapNumbers {
    public static void withThirdVar(int a, int b) {
      System.out.printf("Before swapping: %d\t%d\n", a, b);
      int temp = a;
      a = b;
      b = temp;
      System.out.printf("After swapping: %d\t%d\n", a, b);
    }
    
    public static void withoutThirdVar(int a, int b) {
      System.out.printf("Before swapping: %d\t%d\n", a, b);
      a = a + b; // a = a + b
      b = a - b; // b = (a + b) - b -> a
      a = a - b; // a = (a + b) - ((a + b) - b) -> b
      System.out.printf("After swapping: %d\t%d\n", a, b);
    }
  }

  /*
   * Check if a number is even
   */
  public boolean isEvenNumber(int a) {
    boolean isEven = (a % 2 == 0);
    return isEven;
  }

  /*
   * Check if a number is odd
   */
  public boolean isOddNumber(int a) {
    boolean isOdd = (a % 2 == 1);
    return isOdd;
  }
  /*
   * Check if a number is prime or not
   */
  public static boolean isPrime(int n) {
    if (n == 0 || n == 1 || n % 2 ==0) {
      return false;
    }
    boolean isPrime = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
}
