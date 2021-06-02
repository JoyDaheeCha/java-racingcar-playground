package Domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        isValid(name);
        this.name = name;
        this.position = 0;
    }

    private void isValid(String name) {
        if (name.length()==0 || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1글자 이상이며, 5글자를 초과할 수 없습니다.");
        }
    }

    public void move(boolean shouldMove) {
        if(shouldMove) {
            position++;
        }
    }

    public int getPosition() {
        return this.position;
    }
}
