package org.fersho.lectures.ch01_building_blocks;

public class LocalsVariables {
    public void findAnswer(boolean check) {
        int answer;
        //int atherAnswer;
        //int onlyOneBranch;

        if (check) {
         //   onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 1;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch); // No compila por no estar iniializada la variable onlyOneBranch.
    }

    public void checkAnswer() {
       // boolean value;
        // findAnswer(value); // No compila. value no esta inicializada.
    }

}
