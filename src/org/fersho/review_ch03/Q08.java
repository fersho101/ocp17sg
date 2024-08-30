/*
 * What is the output of calling printType(11)?
 * a. int
 * b. small int
 * c. long
 * d. unknown
 * e. Nothing in printed.
 * f. The code contains one line that does not compile
 * g. The code contains two line that do not compile
 * h. None of above.
 * A08: g.
 * Note:
 *  Line 23. bat is undefined, the compiler can not guarantee that bat is an instance of Long, bat is not in scope.
 *  Line 27. default cannot be used as part of a if/else statement.      
 */
package org.fersho.review_ch03;

public class Q08 {

    void printType(Object o) {
        if (o instanceof Integer bat) {
            System.out.println("int" + bat); // adding "+ bat" to remove the warning.
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.println("small int");
        }
        // else if(o instanceof Long bat || bat <= 20) {
        // System.out.println("Long");
        // } default {
        // System.out.println("uknown");
        // }
    }

    public static void main(String[] args) {
        Q08 q08 = new Q08();
        q08.printType(11L);
    }
}
