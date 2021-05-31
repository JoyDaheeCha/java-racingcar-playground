package RacingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    private int max = 0;

    Cars (String[] carNames) {
        int totalCarNumber = carNames.length;
        for (int i = 0; i < totalCarNumber; i++) {
            Car car = new Car(carNames[i]);
            cars.add(car);
        }
    }

    void moveCars() {
        int carsNumTotal = cars.size();
        for (int i = 0; i < carsNumTotal; i++) {
            cars.get(i).goForwardOrNot();
        }
    }

    private void setMax() {
        List<Integer> positions = new ArrayList<>();
        for(Car car : cars) {
            positions.add(car.getPosition());
        }
        max = positions.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    List<String> getMaxPositionCarNames() {
        setMax();
        List<String> maxPositionCarNames = new ArrayList<>();
        for (Car car: cars) {
            String carName = returnCarNameIfMaxPosition(car);
            maxPositionCarNames.add(carName);
        }
        while(maxPositionCarNames.remove(null));
        return maxPositionCarNames;
    }

    String returnCarNameIfMaxPosition(Car car) {
        if (car.getPosition() == max) {
            return car.getName();
        }
        return null;
    }
}
