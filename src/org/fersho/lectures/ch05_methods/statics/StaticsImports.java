package org.fersho.lectures.ch05_methods.statics;

import static java.util.Arrays.asList; // static import
import java.util.List;

public class StaticsImports {

    // class Imports {
    //     public static void main(String[] args) {
    //         List<String> list = Arrays.asList("one", "two");
    //     }
    // }

    class ZooParking {
        public static void main(String[] args) {
            List<String> list = asList("one", "two"); // No Arrays. prefix
        }
    }

}
