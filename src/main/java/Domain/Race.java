package Domain;

import java.util.List;

public class Race {

    private final int trial;
    private Cars cars;
    
    public Race(Cars cars, int trial) {
        this.cars = cars;
        this.trial = trial;
    }

    public List<Car> getWinner() {
        return cars.getWinner();
    }
}
