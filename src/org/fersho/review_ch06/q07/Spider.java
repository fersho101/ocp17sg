package org.fersho.review_ch06.q07;

/*
 * Q07. What is the output of the following code?
 * a. SpiderSpiderArthropod
 * b. SpiderSpiderSpider
 * c. SpiderSpookyArthropod
 * d. SpookySpiderArthropod
 * e. The code will not compile because of line 5.
 * f. The code will not compile because of line 9.
 * g. None of the above.
 * 
 * A07: 
 */

public class Spider extends Arthropod {
    protected void printName(int input) {
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        Arthropod a = new Spider();
        a.printName((short) 4); // Spider
        a.printName(4); // Spider
        a.printName(5L); // Arthropod
    }
}
