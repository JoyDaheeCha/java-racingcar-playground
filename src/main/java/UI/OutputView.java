package UI;

public class OutputView {
    public void printCurrentPosition(int name, int position) {
        String positionDrawing = "";
        for (int i = 0; i < position; i++) {
            positionDrawing = positionDrawing + "-";
        }
        System.out.println(name + ": " + positionDrawing);
    }


}
