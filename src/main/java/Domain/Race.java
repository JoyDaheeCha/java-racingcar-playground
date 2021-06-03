package Domain;

import UI.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final int trial;
    private Cars cars;
    
    public Race(List<String> names, int trial) {
        this.cars = new Cars(setCars(names));
        this.trial = trial;
    }

    private List<Car> setCars(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (String name: names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void doRacingGame() {
        Movable moveStrategy = new RandomMove();
        for(int i=0; i<trial; i++) {
            cars.moveCars(moveStrategy);
            cars.printCurrentPosition();
        }
    }

    public List<Car> getWinner() {
        return cars.getWinner();
    }
}
