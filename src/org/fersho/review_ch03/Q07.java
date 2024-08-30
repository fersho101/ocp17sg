/*
 * Q07. Assuming weather is a well-formed nonempty array, which code snipped, when inserted independently  into the blank in the following code, prints all of the elements of weather?
 * a. int i=weather.length; i>0; i--
 * b. int i=0; i<=weather.length-1; ++i
 * c. var w: weather
 * d. int i=weather.length-1; i>=0; i--
 * e. int i=0, int j=3;i<weather.length; ++i
 * f. int i=0; ++i<10 && i<weather.length;
 * g. none of the above.
 * A07:  b,d
 */
package org.fersho.review_ch03;

public class Q07 {

    private void print(int[] weather) {
        for(int i=weather.length-1; i>=0; i--) {
            System.out.print(weather[i]);
        }
    }

    public static void main(String[] args) {
        Q07 q07 = new Q07();
        int[] x = {1,2,3,4};
        q07.print(x);
    }

}
