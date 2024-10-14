# Chapter 05

## Questions

### _Q01. Which statements about the final modifier are correct?_

a. Instance and static variables can be marked final.

b. A variable is effectively final only if it is marked final.

c. An object that is marked final cannot be modified.

d. Local variable cannot be declared with type var and the final modifier.

e. A primituve that is marked final cannot be modified.

### _A01: a, e._

### _Q02. Which of the following can fill the blank in this code to make it compile?_

```java
public class Ant {
    ____ void method() {}
}
```

a. ``` default ```

b. ``` final ```

c. ``` private ```

d. ``` Public ```

e. ``` String ```

f. ``` zzz: ```

### _A02: b, c_

### _Q03. Which of the following methods compile?_

a. ```final static void rain() {} ```

b. ``` public final int void snow() {} ```

c. ``` private void int hail() {} ```

d. ``` static final void sleet() {} ```

e. ``` void final ice() {} ```

f. ``` void public slush() {} ```

### _A03: a, d_

### _Q04. Which of the following can fill in the blank and allow the code compile?_

```java
    final ___ song = 6;
```
a. ``` int ```

b. ``` Integer ```

c. ``` long ```

d. ``` Long ```

e. ``` double ```

f. ``` Double ```

### _A04: a, b, c, e_ 

### _Q05. Which of the following methods compile?_

a. ``` public void january() {return;} ```

b. ``` public int february() {return null;} ```

c. ``` public void march() {} ```

d. ``` public int april() {return 9;} ```

e. ``` public int may() {return 9.0;} ```

f. ``` public int june() {return;} ```

### _A05: a, c, d_

### _Q06. Which of the following methods compile?_

a. ``` public void violin(int... nums) {} ```

b. ``` public void viola(String values, int... nums) {} ```

c. ``` public void cello(int... nums, String values) {} ```

d. ``` public void bass(String... values, int...nums) {} ```

e. ``` public void flute(String[] values, ...int nums) {} ```

f. ``` public void oboe(String[], int[] nums) {} ```

### _A06: a, b, f_

### _Q07. Given the following method, which of the method calls return 2?_

```java
    public int juggle(boolean b, boolean... b2) {
        return b2.length;
    }    
```

a. ``` juggle(); ```

b. ``` juggle(true); ```

c. ``` juggle(true, true); ```

d. ``` juggle(true, true, true); ```

e. ``` juggle(true, {true, true}); ```

f. ``` juggle(true, new boolean[2]); ```

### _A07: e,f_

### _Q08. Which of the following statement is correct?_

a. Packege access is more lenient than protected access.

b. A public class that has private fields and package methods is not visible to classes outside the package.

c. You can use access modifiers so only some of the classes in a package see a particular package class.

d. You can use access modifiers to allow access to all methods and not any instance variables.

e. You can use access modifiers to restric access to all classes that begin with the word Test.

### _A08. d_

### _Q15. Which of the following can replace line 2 to make this code compile?_

```java
import java.util.*;
//INSERT CODE HERE

public class Imports {
    public void method(ArrayList<string> list) {
        sort(list);
    }
}
```

a. ``` import static java.util.Collections; ```

b. ``` import static java.util.Collections.*; ```

c. ``` import static java.util.Collections.sort(ArrayList<String>); ```

d. ``` static import java.util.Collections; ```

e. ``` static import java.util.Collections; ```

f. ``` static import java.util.Collections.sort(ArrayList<String>); ```

### _A15: b_

