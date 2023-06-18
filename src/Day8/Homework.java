package Day8;

import Day7.Homework.Utils; // for the method `getDigit()`

public class Homework {

  /*
   * Print fibonacci series
   */
  public void fibonacci(int times) {
    int prev_1 = 0;
    if (times == 1)
      System.out.printf("%d ", prev_1);
    int prev_2 = 1;
    if (times <= 2)
      System.out.printf("%d ", prev_2);
    for (int i = 0; i < times; i++) {
      int current = prev_1 + prev_2;
      System.out.printf("%d ", current);
      prev_1 = prev_2;
      prev_2 = current;
    }

  }

  /*
   * Reverse the elements of an array
   */
  public int[] reverseArr(int[] arr) {
    int[] out = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      out[arr.length - i - 1] = arr[i];
    }
    return out;
  }

  /*
   * Reverse a string
   */
  public String reverseString(String str) {
    String out = "";
    for (int i = 0; i < str.length(); i++) {
      out += str.charAt(str.length() - 1 - i);
    }
    return out;
  }

  /*
   * Check if the given number/array/string is palindrome or not
   */
  public static class CheckPalindrome {
    public boolean number(int num) {
      boolean isPalindrome = true;
      for (int i = 0; i < Math.log10(num) / 2; i++) {
        if (new Utils().getDigit(num, i) != new Utils().getDigit(num, (int) Math.log10(num) - i)) {
          isPalindrome = false;
          break;
        }
      }
      return isPalindrome;
    }

    public boolean array(int[] arr) {
      boolean isPalindrome = true;
      for (int i = 0; i < arr.length / 2; i++) {
        if (arr[i] != arr[arr.length - i - 1]) {
          isPalindrome = false;
          break;
        }
      }
      return isPalindrome;
    }

    public boolean string(String str) {
      boolean isPalindrome = true;
      for (int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
          isPalindrome = false;
        }
      }
      return isPalindrome;
    }
  }
}
