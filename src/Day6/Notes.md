## Loops in Java

#### Using `for`
```java
// Format
for (initialize; condition; increment/decrement) {
  // statements
}

// Example
for (int i = 0; i < 10; i++) {
  System.out.println(i);
}
// `int i = 0` initializes the local variable `i`
// `i < 10` is the condition to be checked before each iteration, if true then statements will be executed
// `i++` is increment to be executed at end of each iteration
// condition checked -> if true -> statemments -> increment -> repeat
//                   -> if false -> loop breaks
```

#### Using `while`
```java
// Format
while (condition) {
  // statements
}

// Example
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
}
// `int i = 0` initializes global variable `i`
// `i < 10` is the condition to be checked before each iteration, if true then statements will be executed
// `i++` is increment to be executed at end of each iteration
// initialization and increment are used here for demonstration only, usually only a condition is used inside `while` loop
// condition checked -> if true -> statemments -> repeat
//                   -> if false -> loop breaks
```

#### Using `do - while`
```java
// Format
do {
  // statement
} while (condition);

// Example
int i = 0
do {
  System.out.println(i)
} while (i < 10);

// A `do - while` loop is similar to a `while` loop, the difference is that in `do - while` loop, 
// the statements are executede atleast once before checking the condition
// statements -> condition checked -> if true -> statemments and repeat
//                                 -> if false -> loop breaks
```

#### Using `for - in`
###### A `for - in` loop is a special type of loop used to iterate over the elements of an array without getting elements by index
```java
// Format
for (type var: array) {
  // statements
}
// `type` is the type of array elements
// `var` is the local variable holding value of element of array which is being iterated over

// Example
int arr = new int[]{1,2,3,4,5};
for (int n: arr) {
  System.out.println(n);
}
```

### Infinite Loops
###### Infinite loops are type of loops in which the condition is always true and the loop runs forever until stopped externally(closing console/system/errors)

#### Using `for`
```java
for (int i = 0; true; i++) {
  // statements
}
// here, `int i = 0`, `i++` are redundant as condition is always true, so we can remove them
for (;;) {
  // statements
}
```
#### Using `while`
```java
while (true) {
  // statements
}
```
#### Using `do - while`
```java
do {
  // statements
} while (true);
```
## Loop Control Statements
#### Using `continue`
###### `continue` skips the current iteration and continues if the loop from next iteration (if exists)
```java
for (int i = 0; i < 10; i++) {
  System.out.println("Current Value: " + i);

  if (i == 3) {
    System.out.println("i = 3 detected")
    continue;
  }
}
```

#### Using `break`
###### `break` stops the execution of the loop statements
```java
for (int i = 0; i < 10; i++) {
  System.out.println("Current Value: " + i)

  if (i == 3) {
    System.oturp
  }
}
```