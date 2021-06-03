package UI;

import Domain.Car;
import java.util.List;

public class OutputView {
    public static void printCurrentPosition(List<Car> cars) {
        cars.stream()
                .map(car -> car.getName() + " : " + drawLine(car.getPosition()))
                .forEach(System.out::println);
        drawEmptyLine();
    }

    private static void drawEmptyLine() {
        System.out.println();
    }

    private static String drawLine(int position) {
        String line = "";
        for (int i = 0; i < position; i++) {
            line = line + "-";
        }
        return line;
    }


}
