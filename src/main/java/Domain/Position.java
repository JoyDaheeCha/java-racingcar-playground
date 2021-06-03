package Domain;

public class Position {
    int position = 0;

    public Position() {
    }

    public Position(int position) {
        this.position = position;
    }

    public void increase() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isGreatherPosition(int position) {
        return this.position > position;
    }

    public boolean isMax(int position) {
        return this.position == position;
    }
}
