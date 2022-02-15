## Clean Code based on Java Convention

Clean code can be summarized as a code that is easily **readable** and **extensible**. It is **focused**, **simple**, **easy to understand**, **testable**. It is a matter of practice and habit. Maintaining **SOLID** principle clean code is more easier to maintain. Using various conventions may lead to a good clean code.

- **Naming** should be  **searchable**, **pronounceable**, **avoiding noise and irrelevant word**
  - **Variable naming**
    - field naming using noun with lowerCamelCase.
    - public static final fields (constants) with UPPER_SNAKE_CASE
  - **Method naming**
    - should be **verb** which express what the method does.
  - **Class naming**
    - using UpperCamelCase
  - **Javatests naming**
    - use an underscore to separate what's being tested from the specific case being tested. For example:
- **Method**
  - should be **simple**
  - having **single responsibility**
  - without **side effects**
- **Consistency**  
  Consistency should be maintained. Not maintaining any consistency in spacing before and after braces, operator or variables are bad practices.

Not Recommended:

```java
	    if(point>target) {
	    	 increaseLevel( );
	        updateTarget( );
	     }
	     if	(	point < requirement	){
		     showWarningMessage();
		     }
```

Recommended :

```java

	    if ( point > target ) {
	    	   increaseLevel( );
	    	   updateTarget( );
	    }

	    if ( point < requirement ) {
	    	   showWarningMessage( );
	    }
```

- **Annotation** - using annotation is recommended in Java.  
  Some annotations should be documented in Javadoc like this- 
  - @Deprecated- @deprecated (Javadoc) 
  - @Override - @inheritdocs 
  - @SuppressWarnings - TODO
- **Brace style**  

Not recommended in Java but maybe Good Practice for other language :

```java
	if ( point > target )
	{
		increaseLevel( );
		updateTarget( );
	}
```

Recommended for Java :

```java
	if ( point > target ) {
		increaseLevel( );
		updateTarget( );
	}
```

- **Repetition**- Duplicate code means change required in multiple places when there is a change in logic and it is very error prone.
- **Do not leave code in comments**
- **Deprecated** library should be avoided.
- **Exception**
  - **generic** exception should be avoided and catch proper possible exception
  - exceptions **should not be ignored**
  - **throwable** is not recommended to use because it includes Error exceptions.
- **Fewer Arguments**  
  Functions should have two or fewer arguments, the fewer the better.
- **Avoiding flag or Boolean parameter** as these naturally contradict the principle of single responsibility. it should be considered dividing the function into two.
- **Limit variable scope** (variable in the innermost block)  

Not recommended :

```java
	    int i=0;

	    while(i<user.length){
	    	//a long calucation
	    	i=i+1;
	    }

	    int a=0, b=0;
	    while(a<book.length){
	    	//a long calucation
	    	a=a+1;
	    }
	    while(b<student.length){
	    	//a long calucation
	    	b=b+1;
	    }
```

Recommended :

```java
	    int i=0; //user array iterator
	    while(i<user.length){
	    	//a long calucation
	    	i=i+1;
	    }

	    int a=0; //book array iterator
	    while(a<book.length){
	    	//a long calucation
	    	a=a+1;
	    }

	    int b=0; //student array iterator
	    while(b<student.length){
	    	//a long calucation
	    	b=b+1;
	    }
```

- **Simple statement**  

Not Recommended :

```java
	number++; position-- ;
```

Recommended :

```java
	number++;
	position-- ;
```

- **Limit line length**
  - Avoid lines longer than 80 characters, since they're not handled well by many terminals and tools.
  - Examples for use in documentation should have a shorter line length-generally no more than 70 characters.

Not recommended :

```java
	if ( ( condition1 && condition2) || ( condition3 && condition4 ) || !( condition5 & condition6 )  || ( condition7 && condition8 ) ) {
					        	    doSomethingAboutIt();
					        	}
```

Recommended :

```java
	     if ((condition1 && condition2)
		|| (condition3 && condition4)
		||!(condition5 && condition6)
		|| ( condition7 & condition8 )) {
	    doSomethingAboutIt();
	}
```

- **Wrapping Lines**  
  When an expression will not fit on a single line, break it according to these general principles: 
  - Break after a comma. 
  - Break before an operator. 
  - Prefer higher-level breaks to lower-level breaks. 
  - Align the new line with the beginning of the expression at the same level on the previous line. 
  - If the above rules lead to confusing code or to code that's squished up against the right margin, just indent 8 spaces instead.

Not recommended :

```java
		if ( ( condition1 && condition2) || ( condition3 && condition4 ) ||
			!( condition5 & condition6 )  || ( condition7 && condition8 ) ) {
		    doSomethingAboutIt();            //bad wrap, easy to miss this line
		}
```

Recommended :

```java
	     if ((condition1 && condition2)
	                || (condition3 && condition4)
	                ||!(condition5 && condition6)
	                || ( condition7 & condition8 )) {
	            doSomethingAboutIt();
	        }
```

- **Order import statements**
  - maintain **lexicographical** order
  - separated by a blank line between each major grouping (android, com, junit, net, org, java, javax)
- **Treating acronyms and abbreviations as words**  

Not recommended :

```
	    getCustomerID
```

Recommended :

```
	    getCustomerId
```

- **Refactoring**  
  Refactoring is the process of changing a software system in such a way that it does not alter the function of the code yet improves its internal structure. Sphaghetti codes can be cleaned using refactoring.

### Reference

- [Introduction to clean coding for beginners](https://www.freecodecamp.org/news/clean-coding-for-beginners/)
- [Clean coding in Java](https://www.baeldung.com/java-clean-code#:~:text=Broadly,%20clean%20code%20can%20be,tutorial%20how%20this%20builds%20up.)
- [Code convention for Java programming language](https://source.android.com/setup/contribute/code-style#define-fields-in-standard-places)
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- [Java code style rules](https://source.android.com/setup/contribute/code-style#define-fields-in-standard-places)
- [How refactoring works in Java](https://codegym.cc/groups/posts/196-how-refactoring-works-in-java)
