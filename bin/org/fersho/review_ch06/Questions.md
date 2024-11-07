# Chapter 06

## Questions

### _Q02. Which modifier pair can be used tigether in a method declaration?_

a. static and final.

b. private and static.

c. static and abstract.

d. private and abstract.

e. abstract and final.

d. private and final.

### _A01: a, b, f._

### _Q03. Which of the following statements about methods are true?_

a. Overloaded methods must have the same signature.

b. Overriden methods must have the same signature.

c. Hidden method must have the same signature.

d. Overloaded methods must the same return type.

e. Overriden methods must the same return type.

f. Hidden methods must have the same return type.

### _A03. b, c._

### _Q09. Which of the following statements about overriden methods are true?_

a. An overriden method must contain method parameters that are the same or covariant with the method parameters in the inherited method.

b. An overriden method may declare a new exception, provided it is not checked.

c. An overriden method must be more accessible than the method in the parent class.

d. An overriden method may declare a broader checked exception than the method in the method in the parent class.

e. If an inherited method returns void, then the overridden version of the method must return void. 

f. None of the above.

### _A09: b, e._


### _Q13. ?Which of these classes compile and will include a default constructor created by the compiler?_

a.
```java
public class Bird {}
```
b.
```java
public class Bird {
    public bird() {}
}
```
c.
```java
public class Bird {
    public bird(String name) {}
}
```
d.
```java
public class Bird {
    public Bird() {}
}
```
e.
```java
public class Bird {
    Bird(String name) {}
}
```
f.
```java
public class Bird {
    private Bird(int age) {}
}
```
g.
```java
public class Bird {
    public Bird bird() {
        return null;
    }
}
```

### _A13: a, g._ 

### _Q14. Which of the following statements about inheritance are correct?_

a. A class can directly extend any number of class.

b. a class can implements any number of interfaces.

c. all variables inherit java.lang.Object.

d. if a class A is extended by B, then B is a superclass of A.

e. if a class C implements inteface D, then C is a subtypeof D.

f. Multiple inheritance is the property of a class to have multiple direct superclass.

### _A14: b, e, f._

### _Q17. Which of the following are true?_

a. this() can be called from anywhere in a constructor.

b. this() can be called from anywhere in an instance method.

c. this.varibleName can be called from any instance method in the class.

d. this.varibleName can be called from any static method in the class.

e. You can call the default contructor written by the compiler using this().

f. You can access a private constructorwith the main() metyhod in the same class.

### _A17. c, f._