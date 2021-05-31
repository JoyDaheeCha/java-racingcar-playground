package RacingCar;

import java.util.List;

public class Race {

    private Cars cars;
    private int trialsTotal = 0;
    ResultView rv = new ResultView();

    Race (String carNamesInput, int trialsTotal) {
        String[] carNames = carNamesInput.split(",");
        this.cars = new Cars(carNames);
        this.trialsTotal = trialsTotal;
    }

    void run() {
        rv.printRaceResultTitle();
        for (int i = 0; i < trialsTotal; i++) {
            cars.moveCars();
            rv.printNewLine();
        }
    }

    void getWinners() {
        List<String> winnerNames = cars.getMaxPositionCarNames();
        rv.printWinnerNames(winnerNames);
    }
}
