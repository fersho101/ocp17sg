package org.fersho.lectures.ch06_class_design.initializing_instances;

public class CuttleFish {
    private String name = "swimmy";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    {
        COUNT++;
        System.out.println(COUNT);
    }

    public CuttleFish() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new CuttleFish();
    }
}
//Output -> 0 Ready swimmy 1 Constructor
/*Steps: ->statics
 ->  main method : first print, then create the instance
 ->  instances vars in order than they appear  
 */