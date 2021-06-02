package Domain;

import java.util.List;

public class Race {
    
    Cars cars;
    
    public Race(Cars cars) {
        this.cars = cars;    
    }

    public List<Car> getWinner() {
        return cars.getWinner();
    }
}
