package RacingCar;

public class RacingMain {

    public static void main(String[] args) {
        InputView iv = new InputView();
        String carNamesInput = iv.getCarNames();
        int trialsTotal = iv.getTrialsTotal();

        Race race = new Race(carNamesInput, trialsTotal);
        race.run();

        race.getWinners();
    }
}
