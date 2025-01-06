package org.fersho.lectures.ch07_beyond_classes.sealing_classes.declaring_sealed_class;

public sealed class Bear permits Kodiak, Panda {

}

final class Kodiak extends Bear {
}

non-sealed class Panda extends Bear {
}

// Examples of classes that are not permitted

// The modifier 'sealed' has to be before class type
// class sealed Frog permits GlassFrog {}

abstract sealed class Wolf permits Timber {
}

final class Timber extends Wolf {
}


//MyWolf isn't listed in the declartion of Wolf
// final class MyWolf extends Wolf {
// } 