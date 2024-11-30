package org.fersho.lectures.ch08_lambdas_and_fnal_interfs.writing_simple_lambdas.lambda_example;

public class CheckIfSwims implements CheckTrait {
    public boolean test(Animal a) {
        return a.canSwim();
    } 
}
