package org.fersho.lectures.ch04_core_apis;

public class WorkingWithIndentation {
    public static void main(String[] args) {
        
        //indent() -> adds the same number of blanck spaces to the beginning of each line.
        //stripIndent() -> works better with concatenation
        /*
         * Some useful rules
         * 
         *  Method                 Indent change                                Normalize existing line breaks  Adds lines breaks at the end if missing
         * indent(n) where n > 0   Adds n spaces to the beginning of each line  Yes                             Yes
         * indent(n) where n == 0  No change                                    Yes                             Yes
         * indent(n) where n < 0   Remove up to n spaces from each line         Yes                             Yes
         * atrinpIndent()          Removes all leading incdental whitespaces    Yes                             No
         */

         var block = """
                     a
                      b
                     c""";
        var concat = " a\n"
                   + "  b\n"
                   + " c";

        System.out.println(block.length());
        System.out.println(concat.length());
        System.out.println(block.indent(1).length());
        System.out.println(concat.indent(-1).length());
        System.out.println(concat.indent(-4).length());
        System.out.println(concat.stripIndent().length());

        System.out.println(block);
        System.out.println(block.indent(2));


        // Translating Escapes
        /*
         * translateEscapes() -> its equivalent escaped characters.
         */
        var str = "1\\t2";
        System.out.println(str); // 1/t2
        System.out.println(str.translateEscapes()); // 1    2

        // Checking for empty or blank strings
        //isEmpty() -> returns a boolean false if there arent nothing,including white space.
        //isBlanck() -> returns a boolean false if there arent characters
    }
}
