# S-expression-calculator
command line prefix notation calculator 

## Build
```
In the Calc Directory run the following commands 
cd src 
javac Calculator.java Constants.java SyntaxChecker.java ExpressionEvaluator.java
```
## Functions: 
In order to evaluate expressions, they must be in the form of Strings. Furthermore, **each expression must be seperated by commas(,).**  
The following functions are built in however, it is quite easy to add new functions in the ExpressionEvaluator Class. 
- add
- multiply
- subtract
- divide

## Examples: 
``` 
java Calculator "45" => 45 
java Calculator "add(1,1)" => 2
java Calculator "multiply(3,6)" => 18
java Calculator "sub(10,4)" => 6
java Calculator "div(6,3)" => 2
java Calculator "add(1, multiply(add(2, 1), 3))" => 10
java Calculator "add(1, multiply(2, 3))" => 7
java Calculator "multiply(add(2, 2), div(9, 3))" => 12
```
