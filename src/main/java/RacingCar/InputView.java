package RacingCar;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    String getCarNames() {
        String carNamesInput = "";
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        carNamesInput = sc.nextLine();
        return carNamesInput;
    }

    int getTrialsTotal() {
        int trials = 0;
        System.out.println("시도할 횟수는 몇 회인가요?");
        trials = Integer.parseInt(sc.nextLine());
        return trials;
    }
}
