# mathlark-v2
Welcome to MathLark, a dynamically-typed programming language cum computer algebra system written
fully in Java.

The programming language is also called Lark and supports a range of features,
including but not limited to
- Variable assignments
- Basic mathematical operations like addition, subtraction, multiplication, division and more...
- 40+ in-built functions encompassing lists, dictionaries, permutation groups, permutations and also colours (Yes you heard it right)!
- Define your own functions, or define an empty function (one that doesn't do anything). Functions are polymorphic (can be defined with different numbers of arguments)
- Define lists and dictionaries

And more features to come, including:
- Polynomial expressions and manipulation
- More permutation groups and Young tableaux
- If, Else and ElseIf statements
- For and While loops

## REPL
MathLark also comes with a REPL that evaluates statements line by line. REPL supports almost every feature the language has to offer, **except**: 
- function definitions (with body)
- calling defined functions
- using return statements
- importing functions

Also, you don't have to use semicolons in the REPL!

## Setting up
Note: This guide assumes that you have the following installed
- Gradle
- Java 17 or newer
- Git

Clone this repository with the command
```
git clone https://github.com/clueless-skywatcher/mathlark-v2.git
```
Run
```
gradle build
```
to start building the project. By default the build command runs several tests which can be time-consuming. You can choose to skip the tests using this command
```
gradle build -x test
```
Once the build is done, you will find a `larkv2-x.x.x.jar` in the `build/libs` directory. You can run
```
java -jar build/libs/larkv2-0.0.1.jar
```
to run the REPL, or optionally provide a file with the .lk extension as an argument to parse the file.
```
java -jar build/libs/larkv2-0.0.1.jar abc.lk
```
## Syntax
When learning a new programming language, we always start with a "Hello World!" program. This one is no different. Write this code in a file
```
PrintLn("Hello World!");
```
then run the aforementioned JAR on that file. The `PrintLn` function, as one would expect, prints a single line on the output.

## Assigning Variables
Let's say we want to declare a variable `a` with value `5` and then print `a` then one can write
```
a := 5;
PrintLn(a);
```
Keep in mind the `:=` operator, that is for assignment (not just an `=` sign as in other languages).

## Declaring Empty Functions
Let's say we want to declare an empty function (if you recall, a function with no body).
```
<f>;
```
Try printing the result of this function applied on an argument
```
<f>;
a := 5;
PrintLn(f(a));
```
The output should be `f(5)`

## Declaring Functions with a Body
Now let's say we want to define a function called `Add` that just adds 1 if one argument is provided, or the sum if both arguments are provided.
We write
```
<Add> := {
    (a) := {
        Return a + 1;
    }
    (a, b) := {
        c := a + b;
        Return c;
    }
}
```
- First we declare the function name `Add1`
- Within the first pair of braces, we can write multiple definitions of the function
based on different numbers of arguments. Here we have 2 definitions, one for a single argument and one for 2 arguments.
- The second pair of braces enclose the body (behaviour) of the function.

In the same file where this function was defined, now if we write
```
PrintLn(Add(81));
PrintLn(Add(5, 9));
```
we get
```
82
14
```
Note: 
- Calling a function before the same is defined will throw an error. This behaviour may be changed in future releases if needed.
- Each definition of a function should have only one return statement in the entire code block (unless within a loop or a conditional block)

## Credits
This project wouldn't be possible without help/inspiration from these repositories/software:
- Bart Kiers' Tiny Language using ANTLR4 (Symbol Scopes are directly implemented from this code): https://github.com/bkiers/tiny-language-antlr4
- Mathematica and the Wolfram Language by Stephen Wolfram (Serves as a major source of inspiration)
- ANTLR4 by Terence Parr
- SageMath (for inspiring implementation of permutations and permutation groups): https://github.com/sagemath/sage
- Redberry-CAS (while code from this is not directly implemented, but their code has helped implementation of permutations): https://github.com/redberry-cas/core
- A little help from ChatGPT and Google AI Studio