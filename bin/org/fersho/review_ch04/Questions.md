# Chapter 04

## Questions

### _Q02. Which of these declarations are not legal?_

a. ``` int[][] scores = new int[5][]; ```

b. ``` Object[][][] cubbies = new Object[3][0][5]; ```

c. ``` String beans[] = new beans[5]; ```

d. ``` java.util.Date[] dates[] = new java.util.Date[2][]; ```

e. ``` int[][] types = new int[]; ```

f. ``` int[][] java = new int[][]; ```

### _A01: c, e, f._

### _Q03. Note that March 13, 2022 is the weekend when we spring forward, November 6, 2022 is when we fall back for daylight saving time. Which of the following can fill in the blank without throwing an exception?_

```java
var zone = ZoneId.of("US/Eastern");
var date = LocalDate.of(2022, 3, 13);
var time = LocalTime.of(2, 15);
var z = ZonedDateTime.of(date, time, zone);

```

a. ``` LocalDate.of(2022, 3, 13) ```

b. ``` LocalDate.of(2022, 3, 40) ```

c. ``` LocalDate.of(2022, 11, 6) ```

d. ``` LocalDate.of(2022, 11, 7) ```

e. ``` LocalDate.of(2023, 2, 29) ```

f. ``` LocalDate.of(2022, MonthEnum.MARCH, 13) ```

### A03: a, c, d

### _Q07. Which of the statements is true of the two values?_

```java
2022-08-28T05:00 GMT-04:00
2022-08-28T09:00 GMT-06:00

```

a. ``` The first date/time is earlier ```

b. ``` The second date/time is earlier ```

c. ``` Both date/time are the same. ```

d. ``` The date/time are two hours apart. ```

e. ``` The date/time are six hours apart. ```

f. ``` The date/time are 10 hours apart. ```

### _A07: a, e_

### _Q09. Which of the following are true about arrays?_

a. The first element is index 0.

b. The first element is index 1.

c. Arrays are fixed size.

d. Arrays are immutables  .

e. Calling ```equals()``` on two different arrays containing the same primitive values always return true.

f. Calling ```equals()``` on two different arrays containing the same primitive values always return false.

g. Calling ```equals()``` on two different arrays containing the same primitive values always return true or false.

### _A09: a, c, e_

### _A10. How many of these lines contains a compiler error?_

```java
int one = Math.min(5, 3);
long two = Math.round(5.5);
double three = Math.floor(6.6);
var doubles = new double[] {one, two, three};
```

a. 0

b. 1

c. 2

d. 3

e. 4

### _A10: a_
