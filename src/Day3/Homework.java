package src.Day3;

import java.util.Scanner;

public class Homework {

  /*
   * Find the Maximum number from given 3 numbers
   */

  // Using Ternary operator
  public int largestInt_usingTernary(int a, int b, int c) {
    return (a > b)
        ? (a > c) // if (a > b) is true => a > b
            ? a // if (a > b) is true and (a > c) is true => a
            : c // if (a > b) is true and (a > c) is false => c
        : (b > c) // if (a > b) is false => b > a
            ? b // if (a > b) is false and (b > c) is true => b
            : c // if (a > b) is false and (b > c) is false => c
    ;

  }

  // Using If-else
  public int largestInt_usingIfElse(int a, int b, int c) {
    if (a > b) { // If (a > b) is true => a > b
      if (a > c) {
        return a; // If (a > b) is true and (a > c) is true => a
      } else {
        return c; // If (a > b) is true and (a > c) is false => c
      }
    } else { // If (a > b) is false => b > a
      if (b > c) {
        return b; // If (a > b) is false and (b > c) is true => b
      } else {
        return c; // If (a > b) is false and (b > c) is false => c
      }
    }
  }

  /*
   * Find the minimum number from given 5 numbers
   */

  public static int minimumInt(int a, int b, int c, int d, int e) {
    return (a < b)
        ? (a < c)
            ? (a < d)
                ? (a < e)
                    ? a
                    : e
                : (d < e)
                    ? d
                    : e
            : (c < d)
                ? (c < e)
                    ? c
                    : e
                : (d < e)
                    ? d
                    : e
        : (b < c)
            ? (b < d)
                ? (b < e)
                    ? b
                    : e
                : (c < e)
                    ? c
                    : e
            : (c < d)
                ? (c < e)
                    ? c
                    : e
                : (d < e)
                    ? d
                    : e;
  }

  /*
   * Get User input in String and Character
   */

  // In String format
  public String getInputString() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter something");
    String input = sc.nextLine();
    sc.close();
    return input;
    // Alternatively we can also use:
    // return new Scanner(System.in).nextLine();
    // But it causes a resource leak as we can't mention `sc.close()`
  }

  // In Character format
  public char getInputCharacter() {
    Scanner sc = new Scanner(System.in);
    String input = getInputString();
    System.out.println("Which character do you want to save? Enter its index");
    int index = sc.nextInt();
    sc.close();
    char input_char = input.charAt(index);
    return input_char;
    // Alternatively we can also use:
    // return new Scanner(System.in).nextLine().charAt(new Scanner(System.in).nextInt());
    // But it causes a double resource leak as we can't mention `sc.close()` twice
  }

}

class Assignment1 {
  /*
   * Write a program to sum three numbers in Java and Input taken with User
   */
  public int addThreeNums() {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i <= 3; i++) {
      sum += sc.nextInt();

    }
    sc.close();
    return sum;
  }

  /*
   * Write a program to Divide two numbers where num1>num2 and num2 != 0
   */
  public int divideTwoNums(int num1, int num2) {
    if (num1 > num2 && num2 != 0) {
      return num1 / num2;
    } else {
      return 0;
    }
  }

  /*
   * Write a program to print whether a number is even or odd, Also take input
   * from the user.
   */
  public void checkEvenOrOdd() {
    Scanner sc = new Scanner(System.in);
    System.out.println((sc.nextInt() % 2 == 0) ? "Even" : "Odd");
    sc.close();
  }

  /*
   * Write a program to get a number from the user and print whether it is
   * positive or negative.
   * 
   */
  public void isPositiveOrNegative() {
    Scanner sc = new Scanner(System.in);
    switch (Boolean.toString(sc.nextInt() >= 0)) {
      case "true":
        System.out.println("Positive");
        break;
      case "false":
        System.out.println("Negative");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }

    sc.close();
  }

  /*
   * Write a program to calculate CGPA using marks of three subjects (out of 100
   */
  public float calcCGPA() {
    float[] marks = new float[3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.printf("Enter marks of subject %d: ", i + 1);
      marks[i] = sc.nextFloat();
    }
    sc.close();
    float totalMarks = 0;
    for (float mark : marks) {
      totalMarks += mark;
    }
    return (totalMarks / 3);
  }

  /*
   * Calculate Electricity Bill using below conditions:
   * 1 to 100 units – Rs. 6/unit
   * 100 to 200 units – Rs. 8/unit
   * 200 to 300 units – Rs. 10/unit
   */
  public float electricityBill(float units) {
    float price = 0f;
    if (200 < units) {
      price += (units - 200) * 10;
      units -= (units - 200);
    }
    if (100 < units && units <= 200) {
      price += (units - 100) * 8;
      units -= (units - 100);
    }
    if (1 < units && units <= 100) {
      price += (units) * 6;
    }
    return price;
  }

  /*
   * Write a program to convert Kilometers to miles using input taken from user
   */
  public float kilometerToMiles(float kms) {
    return (kms * 1.609f);
  }

  /*
   * Write a program to calculate :
   * (A) Area Of Triangle
   * (B) Area Of circle
   * (C) Perimeter of circle.
   * 
   */
  public class Calc {
    public float areaTriangle(float base, float height) {
      return (0.5f * base * height);
    }

    public float areaCircle(float radius) {
      return ((float) (Math.PI) * radius * radius);
    }

    public float perimeterCircle(float radius) {
      return ((float) Math.PI * 2 * radius);
    }
  }

  /*
   * Write a Java program to display the first 10 natural numbers.
   */
  public void first10Numbers() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  /*
   * Write a Java program to get a number from the user and print whether it is
   * positive or negative.
   */
  // 10th question same as 4th
  // `isPositiveOrNegative()`

  /*
   * Write a program in Java to input 5 numbers from the keyboard and find their
   * sum and average.
   */
  public void sumAndAverage() {
    Scanner sc = new Scanner(System.in);
    float[] nums = new float[5];
    float sum = 0f;
    for (int i = 0; i < 5; i++) {
      nums[i] = sc.nextFloat();
    }
    sc.close();
    for (float num : nums) {
      sum += num;
    }
    System.out.printf("Sum: %.2f\nAverage: %.2f", sum, sum / 5);
  }

  /*
   * Write a Java program to find the area of a circle using the given radius
   * ((π) = 3.14) give integer as a output
   */
  public int areaCircleInt(float radius) {
    return (int) (Math.PI * radius * radius);
  }

  /*
   * Write a Java program to find the number of days in a month.
   */
  public int numDaysInMonth(int month) {
    // 1,3,5,7,8,10,12 -> 31 day
    // 2,4,6,9,11 -> 30 day
    if (month <= 7) {
      if (month % 2 == 1) {
        return 31;
      } else {
        return 30;
      }
    } else {
      if (month % 2 == 0) {
        return 31;
      } else {
        return 30;
      }
    }
  }

  /*
   * Write a Java program that takes a year from the user and prints whether
   * it is a leap year or not.
   */
  public boolean isLeapYear(int year) {
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }
}