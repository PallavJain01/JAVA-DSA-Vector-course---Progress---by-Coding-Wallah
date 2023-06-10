package src.Day5;

public class Homework {

  /*
   * Java Program to check whether a year is leap year or not using if-else.
   */
  public boolean isLeapYear(int year) {
    if (year % 100 == 0 && year % 400 == 0) {
      return true;
    } else if ((year % 4 != 0) || (year % 100 == 0)) {
      return false;
    } else if (year % 4 == 0 && year % 100 != 0) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Java Program to check whether a given input is digit or not using if-else.
   */
  public boolean isDigit(String num_str) {
    for (int i = 0; i < num_str.length(); i++) {
      if (num_str.charAt(i) >= '0' && num_str.charAt(i) <= '9') {
        return true;
      }
    }
    return true;
  }

  /*
   * Java Program to check whether a given input is alphabet or not using if-else.
   */
  public boolean isAlphabet(char alph) {
    if ((alph >= 'a' || alph >= 'A') && (alph <= 'z' || alph <= 'Z')) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Java Program to check if a given input is a Digit or Alphabets or Special
   * Character using if-else.
   */
  public String isDigitOrAlphabatOrSpecial(char inp_chr) {
    if (isAlphabet(inp_chr)) {
      return "Alphabet";
    } else if (isDigit("" + inp_chr)) {
      return "Digit";
    } else {
      return "Special";
    }
  }

  /*
   * Java Program to convert temperature from Celsius to Fahrenheit or vice versa
   * using if-else
   *
   * {C -> Celsius} {F -> Farenheight} {K -> Kelvin}
   */
  public float TempCalc(float temp, char typeOfInput, char typeOfOutput) {

    if (typeOfInput == typeOfOutput) {
      return temp;
    }
    if (typeOfInput == 'C') {
      if (typeOfOutput == 'F') {
        return ((temp * (9 / 5)) + 32.0f);
      } else {
        return (temp + 273.15f);
      }
    } else if (typeOfInput == 'F') {
      if (typeOfOutput == 'C') {
        return ((temp - 32.0f) * (5 / 9));
      } else {
        return (((temp - 32.0f) * (5 / 9)) + 275.15f);
      }
    } else {
      if (typeOfOutput == 'C') {
        return (temp - 273.15f);
      } else {
        return (((temp - 273.15f) * (9 / 5)) + 32);
      }
    }
  }

  /*
   * Java Program to check whether a character is a vowel or consonant using
   * if-else.
   */
  public String isVovelOrConstant(char letter) {
    char[] vovels = { 'a', 'e', 'i', 'o', 'u' };
    for (int i = 0; i < vovels.length; i++) {
      if (letter == vovels[i]) {
        return "Vovel";
      }
    }
    return "Consonant";
  }

  /*
   * Java Program to check Division on the basis of marks obtained by students.
   * Percentage >= 60% : Division 1, Percentage >= 45% : Division 2, Percentage >=
   * 30% : Division 3, Percentage < 30% : Fail
   */
  public String checkDivision(float percentage) {
    if (percentage >= 60) {
      return "Division 1";
    } else if (percentage >= 45) {
      return "Division 2";
    } else if (percentage >= 30) {
      return "Division 3";
    } else
      return "Fail";
  }

  /*
   * Java Program to Calculate percentage and grade of students on the basis of
   * marks obtained in 5 subjects Maths, Physics, Chemistry, English and Hindi.
   * Marks of subject is taken as an input: Percentage >= 90% : Grade A,
   * Percentage >= 80% : Grade B, Percentage >= 70% : Grade C, Percentage >= 60% :
   * Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F
   */
  public void percentageAndGrade(float marks[], int maxMarks) {
    float totalMarks = 0;
    for (int i = 0; i < marks.length; i++) {
      totalMarks += marks[i];
    }
    float percentage = (totalMarks * 100) / (marks.length * maxMarks);
    String grade = "";
    if (percentage >= 90) {
      grade = "A";
    } else if (percentage >= 80) {
      grade = "B";
    } else if (percentage >= 70) {
      grade = "C";
    } else if (percentage >= 60) {
      grade = "D";
    } else if (percentage >= 40) {
      grade = "E";
    } else {
      grade = "F";
    }
    System.out.printf("Percentage: %.2f\nGrade: %s\n", percentage, grade);
  }
}