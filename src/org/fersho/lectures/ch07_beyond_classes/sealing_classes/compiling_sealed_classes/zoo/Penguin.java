package org.fersho.lectures.ch07_beyond_classes.sealing_classes.compiling_sealed_classes.zoo;

public sealed class Penguin permits Emperor {

}

final class Emperor extends Penguin {
}
