## Input
#### Using `Scanner` class

```java
import java.util.Scanner; // importing the scannner class
Scanner sc = new Scanner(System.in); // initializing the scanner object

int a = sc.nextInt() // get user input from console and store in Integer format
String b = sc.nextLine() // get the whole line in String format from console
System.out.println(a + " " + b); // Output the entered values

sc.close() // Close Scanner class to avoid Resource Leak
```

### Scanner Class Input Types
Method|Type
-|-
nextInt()|int
nextFloat()|float
nextDouble()|double
nextByte()|byte
nextShort()|short
nextLong()|long
nextBoolean()|boolean
nextLine()|String
next().charAt(index)|char
nextBigInteger()|BigInteger
nextBigDecimal()|BigDecimal

#### Using `BufferedReader` class
(Usually used for large input)
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));

// throws IOException which needs to be handled through a try-catch block
String inp = bfreader.readLine();
System.out.println(inp);
```
## Output
#### Using `print()`
```java
System.out.print(Value); // simply prints the `Value`
```
#### Using `println()`
```java
System.out.println(Value) // prints the `Value` and a `\n` (newline char) after it
```
#### Using `printf()`
```java
System.out.printf("String format", ...args);
// prints the "String format" as per the specified formatting verbs
```
#### Using `format()`
```java
System.out.format("String format", ...args);
// Basically same as `System.out.printf()`
```
#### Formatting Date Using `SimpleDateFormat` Class
```java
import java.text.SimpleDateFormat;
import java.util.Date;

SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
System.out.println(df.format(new Date()));
```
### Formatting Verbs for `printf()` and `format()`

Verb|Type|Description
-|-|-
%d|Integers|Outputs the Integers specified
%x.yf|Floating/Double|`x`: width, `y`: no. of digits after decimal
%s|Strings|Outputs the String specified