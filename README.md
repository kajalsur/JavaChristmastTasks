# Java Christmast Tasks 

#### Test Case 1-
#### Test Case Description:
Changing divisibleBy() method
#### Test Data:
The divisibleBy() method was altered because it did not give me the result which I had expected in the specification. Below is the altered method for divisibleBy().
```
if (numerator % Denominator ==0) return true; 
else return false;  
```  
#### Expected Result:
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
```
#### Actual Results:
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
```
#### Test Case 2-
#### Test Case Description:
Testing code to print out true or false return statements for returing a list of strings from a list of int's, however for multiples of 3 it must return "Fizz", and multiples of five it must return "Buzz". Whereas multiples of both three and five must return “FizzBuzz". Likewise 
#### Test Data:
```
  public void divisibleBy()
    {
        divisibleBy(4,2);
        divisibleBy(3,2);

    }  
```  
#### Expected Result:
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
```
#### Actual Results:
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
```
#### Test Case 3-
#### Test Case Description:
Printing fizzBuzzGenerator(1,15) 
#### Test Data:
The main class included two print out line for fizzBuzzGenerator, and therefore Decided to only include one print out line for fizzBuzzGenerator.
```
System.out.println(fizzBuzzGenerator.FizzBuzz(1,16).toString());
```  
#### Expected Result:
```
1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"
```
#### Actual Results:
```
1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"
```
