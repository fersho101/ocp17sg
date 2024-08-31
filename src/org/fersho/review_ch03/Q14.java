/*
 * Q14. Which statement about the following code snippet are correct?
 * a. The data type of penguin is Integer.
 * b. The data type of penguin in int.
 * c. The data type of emu is undefined.
 * d. The data type of emu is Character.
 * e. The data type of mecaw is List.
 * f. The data type of mecaw is Integer.
 * g. None of the above, as the code does not compile.
 * A13: b, d, f.
 */
package org.fersho.review_ch03;

import java.util.ArrayList;
import java.util.List;

public class Q14 {

    public static void main(String[] args) {

        for (var penguin : new int[2])
            System.out.println(penguin);
        var ostrich = new Character[3];
        for (var emu : ostrich)
            System.out.println(emu);
        List<Integer> parrots = new ArrayList<Integer>();
        for (var macaw : parrots)
            System.out.println(macaw);
    }
}
