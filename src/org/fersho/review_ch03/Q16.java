/*
 * Q16. Given the following array, which code snipped print the elements in reverse order from does they are declared?
 * Note: answer options are in main body. 
 * A16: a, b, d
 */ 
package org.fersho.review_ch03;

public class Q16 {

    public static void main(String[] args) {
        
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};

        //a
        int q = wolf.length;
        for(;;) {
            System.out.print(wolf[--q]);
            if(q==0) break;
        }
            
        //b 
        /* 
        for(int m=wolf.length-1;m>=0;--m)
            System.out.println(wolf[m]);
        */
        //c
        /* 
        for(int z=0; z<wolf.length;z++)
            System.out.println(wolf[wolf.length-z]);
        */
        //d
        /* 
        int x = wolf.length-1;
        for(int j=0; x>=0 && j==0;x--)
            System.out.println(wolf[x]);    
        */
        //e
        /* 
        final int r = wolf.length;
        for(int w=r-1; r > -1; w=r-1)
        System.out.println(wolf[w]);
        */
        //f
        /* 
        for(int i=wolf.length; i>0; --i) 
            System.out.println(wolf[i]);
        */
        //g. None of the above.
    }

}
