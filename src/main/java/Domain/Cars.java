package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    //TODO 2-depth indent 제거 방법 찾기
    public List<Car> getWinner() {
        int max = getMax();
        List<Car> winners = new ArrayList<>();
        for(Car car: cars) {
            if(car.isMax(max)){
                winners.add(car);
            }
        }
        return winners;
    }


    //TODO 2-depth indent 제거 방법 찾기
    private int getMax() {
        int max = 0;
        for (Car car: cars) {
            if(car.hasGreaterPosition(max)){
                max = car.getPosition();
            }
        }
        return max;
    }


}
