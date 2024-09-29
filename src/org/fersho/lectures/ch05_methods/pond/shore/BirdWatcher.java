package org.fersho.lectures.ch05_methods.pond.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
