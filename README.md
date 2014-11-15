# Rational Numbers - Proof of Concept :
## Program Features :
   * A Library consisting of functions which can be used on instances of RationalNumber Class.
   * Addition, Subtraction, Multplication, Division, Max, Min, Power, Comparison, Additive Inverse, Multiplicative Inverse Operations.
   * Performs Further Simplification after individual Operations.
   * Operations Performed with usage of Operators also [+,-,*,/,^,<,>,==].
  
## Program Details :
   * Program is written in Scala.
   * Instantiate using : new Rational(numerator,denominator) => numerator/denominator
   * Instantiate using : new Rational(numerator) => numerator/1
   * Operations [ a,b Instances of RationalNumber ]
      * a add b or a + b
      * a subtract b or a - b
      * a multiply b or a * b
      * a divide b or a / b
      * a lessThan b or a < b or a > b
      * a max b
      * a min b
      * a isEqual b or a == b
      * a pow 2 or a^2
      * a multiplicativeInverse 2 or a^(-2)
      * a additiveInverse or -a

## Program Execution :
```
  # Windows and Posix OS Compliant.
  > scalac rational.scala
  > scala -i rational
```

## To Do :
  * Add More Operations performed by Rational Numbers.
  * An Interface for the RationalNumber Class.
