package org.fersho.lectures.ch08_lambdas_and_fnal_interfs.writing_simple_lambdas.lambda_example;

import java.util.ArrayList;
import java.util.List;


public class TraditionalSearch {
    public static void main(String[] args) {
        //list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangoroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //tradicional
        print(animals, new CheckIfHopper());
        print(animals, new CheckIfSwims());

        //pass class that does check
        System.out.println("lambdas\n");
        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
        print(animals, a -> !a.canSwim());

    }

    private static void print(List<Animal> animals, CheckTrait checker ) {
        for(Animal animal: animals) {
            //General check
            if(checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }
}
