package org.fersho.review_ch06.q06;

/*
 * Q06. Which of the following declare immutable classes?
 * a. Moose
 * b. Caribou
 * c. Reideer
 * d. Elk
 * e. Deer
 * f. None of the above.
 * 
 * A06: d, e.
 */

// final class Moose {
//     private final int antlers;
// }

class Caribou {
    private int antlers;
}

class Reindeer {
    private final int antlers = 5;
}

final class Elk {
}

final class Deer {
    private final Object o = new Object();
}