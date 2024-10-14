/*
 * Q09. Given the following class definitions, which lines in the main() method generate a compiler error?
 * a. None: the code compiles fine.
 * b. Line 5
 * c. Line 6
 * d. Line 7
 * e. Line 8
 * f. Line 9
 */

package org.fersho.review_ch05.q09.my.city;

import org.fersho.review_ch05.q09.my.school.*;

public class School {
    public static void main(String[] args) {
        // System.out.println(Classroom.globalKey); //diferent package
        // Classroom room = new Classroom(101, "Mrs. Anderson");  //diferent package
        // System.out.println(room.roomNumber); //private and diferent package
        System.out.println(Classroom.floor);
        // System.out.println(Classroom.teacherName); //protected and diferent package
    }
}
