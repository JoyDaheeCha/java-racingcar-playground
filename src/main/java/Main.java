import Domain.Car;
import Domain.Cars;
import Domain.Race;
import UI.InputView;
import UI.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputView iv = new InputView();
        OutputView ov = new OutputView();

        List<String> carNames =  iv.getCarNames();
        int trial = iv.getTrials();

        Race race = new Race(carNames, trial);

    }
}
