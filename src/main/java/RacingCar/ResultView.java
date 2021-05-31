package RacingCar;

import java.util.Collections;
import java.util.List;

public class ResultView {

    StringBuilder sb = new StringBuilder();

    void printRaceResultTitle() {
        System.out.println("실행 결과");
    }

    void printCarNameAndCurrentPosition(String carName, int position) {
        String bars = drawCurrentPosition(position);
        resetStringBuilder();
        String status = sb.append(carName).append(":").append(bars).toString();
        System.out.println(status);
    }

    void warnInValidCarName(String name, int nameLength) {
        resetStringBuilder();
        String comment = sb.append("자동차 이름은 5자를 초과할 수 없습니다.")
                .append(name).append("은 총 ").append(nameLength).append("글자 입니다.").toString();
        System.out.println(comment);
    }

    private String drawCurrentPosition(int position) {
        String bars = String.join("", Collections.nCopies(position,"-"));
        return bars;
    }

    private void resetStringBuilder() {
        sb.setLength(0);
    }

    void printWinnerNames(List<String> winnerNames) {
        resetStringBuilder();
        String winners = winnerNames.toString()
                .replace("[","")
                .replace("]","");
        String comment = sb.append(winners).append("가 최종 우승했습니다.").toString();
        System.out.println(comment);
    }

    void printNewLine() {
        System.out.println("");
    }

}
