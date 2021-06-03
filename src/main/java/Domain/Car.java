package Domain;

import java.util.Objects;

public class Car {
    private final String name;
    private int position;

    /**
    * 프로덕션용 생성자
    * */
    public Car(String name) {
        isValid(name);
        this.name = name;
        this.position = 0;
    }

    /**
    * 테스트용 생성자
    * */
    public Car(String name, int position) {
        isValid(name);
        this.name = name;
        this.position = position;
    }

    private void isValid(String name) {
        if (name.length()==0 || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1글자 이상이며, 5글자를 초과할 수 없습니다.");
        }
    }

    public void move(Movable moveStrategy) {
        if(moveStrategy.createMovable()) {
            position++;
        }
    }

    public int getPosition() {
        return this.position;
    }
    public String getName() {
        return this.name;
    }

    public boolean hasGreaterPosition(int position) {
        return this.position > position;
    }


    public boolean isMax(int max) {
        return this.position == max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
