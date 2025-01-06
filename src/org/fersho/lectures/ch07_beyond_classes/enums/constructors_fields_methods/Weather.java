package org.fersho.lectures.ch07_beyond_classes.enums.constructors_fields_methods;

public interface Weather {
    int getAverageTemperature();
}

enum SeasonTemps implements Weather {
    WINTER, SPRING, SUMMER, FALL;

    public int getAverageTemperature() {
        return 30;
    }
}
