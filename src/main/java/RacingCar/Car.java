package RacingCar;

import java.util.Random;

public class Car {

    ResultView rv;

    private String name;
    private int position;

    Car (String name) {
        isValidName(name);
        this.name = name;
        this.position = 0;

        rv = new ResultView();
    }

    void isValidName(String name) {
        int nameLength = name.length();
        if (nameLength > 5) {
            rv.warnInValidCarName(name,nameLength);
            throw new IllegalArgumentException();
        }
    }

    void goForwardOrNot() {
        Random rd = new Random();
        if (rd.nextBoolean()) {
            position++;
        }
        rv.printCarNameAndCurrentPosition(name,position);
    }

    String getName() {
        return name;
    }

    int getPosition() {
        return position;
    }
}
