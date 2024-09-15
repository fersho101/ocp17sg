package org.fersho.lectures.ch04_core_apis;

public class SomeStringsMethods {
    public static void main(String[] args) {
        var name = "animals";

        // length() -> Returns th number of characters in the string.
        System.out.println(name.length()); // 7

        // charAt() -> return the char at a specific index.
        System.out.println(name.charAt(0)); // a
        System.out.println(name.charAt(6)); // s
        // System.out.println(name.charAt(7)); // throws an exception at runtime because
        // 7 is aout of range.
        System.out.println("***");
        // indexOf() -> return the index that match with the char, int o string
        // parameter. if it can't find a match, returns -1.

        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4)); // 4
        System.out.println(name.indexOf("al", 5)); // -1
        System.out.println(name.indexOf(83)); // -1

        System.out.println("***");

        // substring() -> returns a parts of the string parameter. beginIndex include
        // the chat in that index. endIndex does not include that char.

        System.out.println(name.substring(3)); // mals
        System.out.println(name.substring(name.indexOf('m'))); // mals
        System.out.println(name.substring(3, 4)); // m
        System.out.println(name.substring(3, 7));// mals
        System.out.println(name.substring(3, 3)); // empty
        // System.out.println(name.substring(3, 2)); //exception
        // System.out.println(name.substring(3, 8)); //exception

        System.out.println("***");

        // toUpperCase() -> returns the string in upperCase
        System.out.println(name.toUpperCase()); // ANIMALS

        // toLowerCase() -> returns the string in lowerCase
        System.out.println(name.toLowerCase()); // animals

        System.out.println("***");

        // equals() -> checks if two strings objects contains exactly the same
        // characters in the same ordes and return a boolean value.
        System.out.println("abc".equals("ABC")); // false
        System.out.println("abc".equals("abc")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println("***");

        // Searching for substrings startsWith(), endWith(), contains() returns a
        // boolean value

        System.out.println(name.startsWith("a")); // true
        System.out.println(name.endsWith("a")); // false
        System.out.println(name.contains("mals")); // true

        System.out.println("***");

        // replace() -> a simple search and replace on the string

        System.out.println("abc".replace('a', 'A'));
        System.out.println("abc".replace("a", "A"));

        System.out.println("***");

        // trim() -> remove blank space from the beginning and the end
        // strip() -> remove blank space from the beginning and the end, also supports
        // unicode.
        // stripLeading() -> remove blank space from the beginning.
        // stripTrailing() -> remove blank space from the end.

    }

}
