## Conditional Statements
#### Using `if - else`
```java
if (condition) {
  // execute this if the condition is true
}
else {
  // execute this if the condition is false
}
```

#### Using `if - else if - else`
```java
if (condition1) {
  // execute this if condition1 is true
}
else if (condition2) {
  // execute this if condition1 is false and condition2 is true
}
else {
  // execute this if both condition1 and condition2 are false
}
```
#### Using `switch - case`
```java
switch (expression) {
  case value1: {
    // execute this if (expression == value1) is true
  }
  case value2: {
    // execute this if (expression == value2) is true
  }
  default: {
    // execute this if expression doesn't matches any of the cases
  }
}

// curly brackets `{}` are optional if there is only one statement inside case
switch (expression) {
  case value1:
    // statement
  case value2:
    // statement
  default:
    // statement
}
```
