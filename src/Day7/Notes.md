## Types of Methods

#### Non-return Type
```java
void methodName() {
	// statemets
}
```
#### Return Type
```java
returnType methodName() {
	// statements
	returnType value = // some value here
	return value;
}
```
#### None-Return Type with parameter
```java
void methodName(type parameter1, type parameter2) {
	// statements
}
```
#### Return Type with parameter
```java
returnType methodName(type parameter1, type parameter2) {
	// statements
	returnType value = // some value here
	return value;
}
```
## Method Overloading
###### Method overloading means creating another function with same name but changing a few values:
- Number of Parameters
- Data type of Parameters
- Position of Parameters
#### Applicable if in same class
```java
int add(int a, int b) {
	return a + b;
}

int add(float a, float b) {
	return (int) (a + b);
}

int add(float a, float c, float b) {
	return a + b + c;
}
```
###### Here there are two functions which perform same operation but return and take values of different types

## Recursion
###### Recursion means calling a function within itself
###### Here the function is called within itself in order to add numbers from `1` to `n`
```java
int sumOfnNumbers(int n) {
	if (n >= 1) {
		return (n + sumOfnNumbers(n - 1));
	} else return 0;
}
```

###### Here the function is called within itself in order to find factorial of `n`
```java
int factorial(int n) {
	if (n > 1) {
		return (n * factorial(n - 1));
	} else return 1;
}
```
