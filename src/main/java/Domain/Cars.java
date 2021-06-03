package Domain;

import UI.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCars(Movable moveStrategy) {
        for (Car car:cars) {
            car.move(moveStrategy);
        }
    }

    public List<Car> getWinner() {
        List<Car> winners = new ArrayList<>();
        cars.forEach(car -> addWinner(getMaxPositionAmongParticipants(), winners, car));
        return winners;
    }

    private void addWinner(int max, List<Car> winners, Car car) {
        if(car.hasMaxPosition(max)){
            winners.add(car);
        }
    }

    private int getMaxPositionAmongParticipants() {
        int max = 0;
        for (Car car: cars) {
            max = updateMaxPosition(max, car);
        }
        return max;
    }

    private int updateMaxPosition(int max, Car car) {
        if(car.hasGreaterPosition(max)){
            max = car.getPosition();
        }
        return max;
    }

    public void printCurrentPosition() {
        OutputView.printCurrentPosition(this.cars);
    }
}
