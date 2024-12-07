package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.inheriting_duplicate_abs_meths;

interface Herbivore {
    public void eatPlants();
}

interface Omnivore {
    public void eatPlants();
}

interface Carnivore {
    public void eatMeat();
}

interface Carnivore2 {
    public int eatMeat();
}

public class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eatPlants'");
    }

}

// class Tiger implements Carnivore, Carnivore2 {

// // The return type is incompatible with Carnivore.eatMeat()

// public int eatMeat() {}

// }