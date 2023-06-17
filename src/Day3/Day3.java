package Day3;
public class Day3 {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    // Arithmetic
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(b % a);

    System.out.printf("pre: %d", --a);
    System.out.printf("post: %d", a++);

    System.out.println(2 >= 3);
    System.out.println(a < 3);
    System.out.println(a == b);
    int largestInt = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    System.out.println(largestInt);

    System.out.println(2 < 3 && (a++) < 3);
    System.out.println(a);

    // Bitwise
    System.out.println(2 > 3 & (b++) < 3);
    System.out.println(a);
    System.out.println(2 > 3 | 2 < 3);

    // Bitwise
    System.out.println(2 ^ 3);
    System.out.println(-(10 >> 6));
  }
}