import Domain.Car;
import Domain.Cars;
import Domain.Race;
import UI.InputView;
import UI.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Race race = new Race(InputView.getCarNames(), InputView.getTrials());
        race.doRacingGame();
        OutputView.printWinners(race.getWinner());
    }
}
