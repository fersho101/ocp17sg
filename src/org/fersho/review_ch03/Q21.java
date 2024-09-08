/*
 * Q21. A minimum of how many lines need to be corrected before the following method will compile?
 * a. Zero
 * b. One
 * c.Two
 * d. Three
 * e. Four
 * f. Five
 * A21: e.
 * Note:
 * Long type is not compatible for switch, block statement must have a yield, all the case values must be unique.   
 */
package org.fersho.review_ch03;

public class Q21 {
    /* Code
     * void findZookeeper(Long id) {
        * System.out.print(switch(id) {
        * case 10 -> {"Jane"}
        * case 20 -> {yield "Lisa";};
        * case 30 -> "Kelly";
        * case 30 -> "Sarah";
        * default -> "Unassigned";
        * });
     * }
     */

    // fixed to compile
    void findZookeeper(int id) {
        System.out.println(switch (id) {
            case 10 -> {
                yield "Jane";
            }
            case 20 -> {
                yield "Lisa";
            }
            case 30 -> "Kelly";
            case 31 -> "Sarah";
            default -> "Unassigned";
        });
    }

    public static void main(String[] args) {
        Q21 q = new Q21();
        q.findZookeeper(20);
    }
}
