# Variable
- Name should be noun
- Pronounceable
- Avoiding noise and irrelevant word
- Short yet meaningful 
- One-character variable names should be avoided  
- Fields using lowerCamelCase
- Constant using UPPER_SNAKE_CASE
- Public static final fields using UPPER_SNAKE_CASE
- One declaration per line is recommended 
- Put declarations only at the beginning of blocks. 
- Do not declare the same variable name in an inner block 
- Try to initialize local variables where they’re declared.y
- Numerical constants (literals) should not be coded directly, the constant should be declared as a constant variable first.
- Do not use the assignment operator in a place where it can be easily confused with the equality operator
- Do not use embedded assignments in an attempt to improve run-time performance


# Method
- Should be verbs
- lowerCamelCase
- Methods are separated by a blank line
- Try to make the structure of your program match the intent.
- Generic exception should be avoided and catch proper possible exception
- Exceptions should not be ignored
- Throwable is not recommended to use because it includes Error exceptions.

# Class   
Should be 
- Nouns 
- UpperCamelCase 
- Simple and descriptive 
- Avoid acronyms and abbreviations (unless the abbreviation is much more widely used than the long form, such as URL or HTML).
- Javatests class naming - use an underscore to separate what's being tested from the specific case being tested.
- Don’t make any instance or class variable public without good reason
- Avoid using an object to access a class (static) variable or method
 
# Braces
- No space between a method name and the parenthesis “(“ starting its parameter list
- Open brace “{” appears at the end of the same line as the declaration statement
- Closing brace “}” starts a line by itself indented to match its corresponding opening statement, except when it is a null statement the “}” should appear immediately after the “{“
- If an expression containing a binary operator appears before the ? in the ternary ?: operator, it should be parenthesized.
- It is generally a good idea to use parentheses liberally in expressions involving mixed operators
to avoid operator precedence problems. 

# Line Formatting
## Indentation
Four spaces should be used as the unit of indentation. The exact construction of the indentation (spaces vs. tabs) is unspecified. Tabs must be set exactly every 8 spaces.
## Line Length  
Avoid lines longer than 80 characters
## Wrapping Lines  
Wrapping lines should be according to these general principles:    
- Break after a comma.
- Break before an operator.
- Prefer higher-level breaks to lower-level breaks.
- Align the new line with the beginning of the expression at the same level on the previous line.
- If the above rules lead to confusing code or to code that’s squished up against the right
margin, just indent 8 spaces instead.

## Blank Lines  
Blank lines improve readability by setting off sections of code that are logically related.
Two blank lines should always be used in the following circumstances:  
- Between sections of a source file
- Between class and interface definitions
One blank line should always be used in the following circumstances:
- Between methods
- Between the local variables in a method and its first statement
- Before a block or single-line comment
## Blank Spaces
Blank spaces should be used in the following circumstances:
- A keyword followed by a parenthesis should be separated by a space.
Note that a blank space should not be used between a method name and its opening
parenthesis. This helps to distinguish keywords from method calls.
- A blank space should appear after commas in argument lists.
- All binary operators except . should be separated from their operands by spaces. 
- Blank spaces should never separate unary operators such as unary minus, increment (“++”), and decrement (“--”) from their operands. 
- The expressions in a for statement should be separated by blank spaces. 
- Casts should be followed by a blank.

# Comments
## Implementation Comment Formats
- Block Comments - A block comment should be preceded by a blank line to set it apart from the rest of the code.  Block comments have an asterisk “*” at the beginning of each line except the first.
```java
/*
* comment
*/
```
- Single-Line Comments -  A single-line comment should be preceded by a blank line
```java
/* comment */
```
- End-Of-Line Comments - The // comment delimiter begins a comment that continues to the newline.
```java
// comment
```
- Use XXX in a comment to flag something that is bogus but works. 
- Use FIXME to flag something that is bogus and broken.
## Documentation Comments
Doc comments describe Java classes, interfaces, constructors, methods, and fields. Each doc
comment is set inside the comment delimiters /**...*/, with one comment per API. This
comment should appear just before the declaration:
```java
/**
 * The Example class provides ...
 */
class Example { ...

```
**Annotation** - using annotation is recommended in Java.  
  Some annotations should be documented in Javadoc as a pair of java annotations- 
  - @Deprecated- @deprecated (Javadoc) 
  - @Override - @inheritdocs 
  - @SuppressWarnings - TODO



