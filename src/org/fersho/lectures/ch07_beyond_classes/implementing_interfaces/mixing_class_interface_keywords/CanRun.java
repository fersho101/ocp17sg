package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.mixing_class_interface_keywords;

public interface CanRun {

}

// class cannot extends an interface
// class Cheetah extends CanRun {}

class Hyena {
}

// interface cannot extends a class
// interface HasFur extends Hyena {}