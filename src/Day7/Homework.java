package Day7;

import java.util.Arrays;

public class Homework {
  /*
   * Print ASCII values using recursion
   */
  public int printASCII(int start) {
    if (65 <= start && start <= 90) {
      System.out.printf("%s : %d\n", (char) start, start);
      printASCII(start + 1);
    } else if (97 <= start && start <= 122) {
      System.out.printf("%s : %d\n", (char) start, start);
      printASCII(start + 1);
    }
    return 0;
  }

  /*
   * Print factorial using for-loop and recursion
   */
  public static class Factorial {
    public long using_recursion(int n) {
      if (n >= 1) {
        return (n * using_recursion(n - 1));
      }
      return 1;
    }

    public long using_loop(int n) {
      long fact = 1;
      if (n >= 1) {
        for (int i = n; i > 1; i--) {
          fact *= i;
        }
        return fact;
      }
      return 1;
    }
  }

  /*
   * Print Fabonacci series
   */
  public static class Fibonacci {
    public void using_recursion(int times, int prev_1, int prev_2) {
      if (prev_1 == 1 && prev_2 == 1) {
        System.out.print("1 1");
      }
      if (times > 1) {
        int current = prev_1 + prev_2;
        System.out.print(" " + current);
        using_recursion(times - 1, prev_2, current);
      }
    }

    public void using_loop(int times) {
      System.out.print("1 1");
      int prev_1 = 1;
      int prev_2 = 1;
      for (int i = 0; i < times; i++) {
        int current = prev_1 + prev_2;
        System.out.print(" " + current);
        prev_1 = prev_2;
        prev_2 = current;
      }
    }
  }

  /*
   * Print the digits of a number
   */
  public void printDigits(int n) {
    int[] digits = new int[(int) Math.log10(n) + 1];
    for (int i = (int) Math.log10(n); i >= 0; i--) {
      digits[i] = n % 10;
      n /= 10;
    }
    System.out.println(Arrays.toString(digits));
  }

  /*
   * Check if a number is ArmStrong number or not
   */
  public boolean isArmStrong(int n) {
    int sum = 0;
    for (int i = 0; i < Math.log10(n); i++) {
      sum += (int) Math.pow(new Utils().getDigit(n, i), 3);
    }
    if (sum == n) {
      return true;
    }
    return false;
  }

  /*
   * Check if a number is palindrome or not
   */
  public boolean isPalindrome(int n) {
    boolean isPalindrome = true;
    int index_l = 0;
    int index_r = (int) Math.log10(n) - 1;
    while (isPalindrome) {
      if (new Utils().getDigit(n, index_l) != new Utils().getDigit(n, index_r)) {
        return isPalindrome = false;
      }
    }
    return isPalindrome;
  }

  /*
   * Utility class made to help make the code easier to read/work
   */
  public static class Utils {
    public int getDigit(int n, int index) {
      int digit = 0;
      for (int i = (int) Math.log10(n); i >= 0; i--) {
        digit = n % 10;
        n /= 10;
        if (i == index) {
          return digit;
        }
      }
      return -1;
    }

  }

}
