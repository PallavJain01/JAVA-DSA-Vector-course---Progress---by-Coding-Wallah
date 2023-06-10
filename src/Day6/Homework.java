package src.Day6;

public class Homework {

  /*
   * Sum of n natural numbers taking user input
   */
  public int sumOfNNaturalNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  /*
   * Sum of n odd natural numbers
   */
  public int sumOfOddNaturalNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n * 2; i += 2) {
      sum += i;
    }
    return sum;
  }

  /*
   * Print character from string using loop
   */
  public void printCharsFromString(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i));
    }
  }

  /*
   * Print digits of a number
   */
  public void printDigits(int n) {
    for (int i = 0; i < Math.log10(n); i++) {
      System.out.println(Integer.toString(n).charAt(i));
    }
  }

  /*
   * Print Armstrong number between 1 - n
   */
  public boolean isArmstrongNumber(int n) {
    double sum = 0;
    for (int i = 0; i < Math.log10(n); i++) {
      sum += Math.pow(Double.parseDouble("" + Integer.toString(n).charAt(i)), 3);
    }
    if (sum == n) {
      return true;
    }
    return false;
  }

  /*
   * Print all ASCII values and characters
   */
  public void printASCII() {
    for (int i = 65; i <= 90; i++) {
      System.out.printf("%s : %d\t\t%s : %d\n", (char) (i + 32), i + 32, (char) i, i);
    }
  }
}
