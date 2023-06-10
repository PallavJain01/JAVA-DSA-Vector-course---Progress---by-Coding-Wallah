# Operators

### Arithmetic
```java
type newVar = value1 [operator] value2;
```
- `+` : Addition
- `-` : Subtraction
- `*` : Multiplication
- `/` : Division
- `%` : Remainder
### Relational/Conditional
```java
boolean condition1 = value1 [operator] value2
```
- `==` : Equal to
- `!=` : Not Equal to
- `<`&nbsp;&nbsp; : Less than
- `<=` : Less than / Equal to
- `>` &nbsp;&nbsp;: Greater than
- `>=` : Greater than / Equal to
### Unary
```java
// Post
myVar[operator];

// Pre
[operator]myVar;
```
- `++` : Increment
- `--` : Decrement
### Ternary
```java
(condition) ? expression1() : expression2()
// can be restructured as:
if (condition) {
  expression1()
}
else {
  expression2()
}
```
- `? :` : Ternary
### Logical
```java
boolean res = value1 [operator] value2
```
- `&&` : And
- `||` : Or
- `!` &nbsp; : Not
### Bitwise
```java
// for `&`, `|`, `^`
int a = value1 [operator] value2

// for `~`
int a = ~ value
```
- `&` : And
- `|` : Or (Inclusive)
- `^` : Or (Exclusive)
- `~` : Complement
### Shift
```java
int a = value [operator] shiftAmount
```
`Signed`&nbsp;&nbsp; : Shifts in decimal form
`Unsigned`: Shifts Binary digits
- `<<`&nbsp; : Signed Left Shift
- `>>`&nbsp; : Signed Right Shift
- `>>>` : Unsigned Right Shift
### Relational/Short Hand
```java
type myVar [operator]= value
// perform operation and assign value to left hand side variable
```
- `+=`&nbsp;&nbsp;&nbsp; : Addition
- `-=`&nbsp;&nbsp;&nbsp; : Subtraction
- `*=`&nbsp;&nbsp;&nbsp; : Multiplication
- `/=`&nbsp;&nbsp;&nbsp; : Division
- `%=`&nbsp;&nbsp;&nbsp; : Remainder
- `&=`&nbsp;&nbsp;&nbsp; : And
- `|=`&nbsp;&nbsp;&nbsp; : Or (Inclusive)
- `^=`&nbsp;&nbsp;&nbsp; : Or (Exclusive)
- `~=`&nbsp;&nbsp;&nbsp; : Complement
- `<<=`&nbsp; : Signed Left Shift
- `>>=`&nbsp; : Signed Right Shift
- `>>>=`: Unsigned Right Shift