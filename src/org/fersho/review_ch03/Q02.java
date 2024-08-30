/*
 * Q02. What is the output of the following code snippet ?
 */
package org.fersho.review_ch03;

public class Q02 {
    public static void main(String[] args) {
        
        int temperature = 4;
        long humidity = -temperature + temperature * 3;
        if(temperature >= 4)
            if (humidity < 6) 
                System.out.println("Too low"); 
            else 
                System.out.println("Just right");
        else 
            System.out.println("Too High");
    }

}
