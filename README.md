# Rational Numbers - Proof of Concept :
## Program Features :
   * A Library consisting of functions which can be used on instances of RationalNumber Class.
   * Addition, Subtraction, Multplication, Division, LessThan and Max operation.
   * Performs Further Simplification after individual Operations.
   
## Program Details :
   * Program is written in Scala.
   * Instantiate using : new Rational(numerator,denominator) => numerator/denominator
   * Instantiate using : new Rational(numerator) => numerator/1
   * Operations [ a,b Instances of RationalNumber ]
      * a add b
      * a subtract b
      * a multiply b
      * a divide b
      * a lessThan b
      * a max b

## Program Execution :
```
  # Windows and Posix OS Compliant.
  > scalac rational.scala
  > scala -i rational
```

## Internal Implementation :
    * Trie => ``` Creates a trie composed of all Nodes. ```
    * Node
        * Map => ``` Key -> Character, Value -> Node. ```
        * Rank => ``` Stores Rank for Current Character. ```
        * Terminal => ``` Indicates End of Word. ```

## To Do :
  * Add More Operations performed by Rational Numbers.
  * An Interface for the RationalNumber Class.
