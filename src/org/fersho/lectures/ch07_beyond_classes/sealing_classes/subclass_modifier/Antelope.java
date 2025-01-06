package org.fersho.lectures.ch07_beyond_classes.sealing_classes.subclass_modifier;

//final

public sealed class Antelope permits Gazelle {

}

final class Gazelle extends Antelope {

}

// class George extends Antelope {} // George isn't listed in the declaration of
// Antelope

// sealed

sealed class Mammal permits Equine {
}

sealed class Equine extends Mammal permits Zebra {
}

final class Zebra extends Equine {
}

// final class Zebra extends Mammal {} // Zebra isn't listed in the declaration
// of Mammal

// non-sealed

sealed class Wolf permits Timber {
}

non-sealed class Timber extends Wolf {
}

class MyWolf extends Timber {
}

class MyFurryWolf extends MyWolf {
}