package Domain;

import java.util.Objects;

public class Car {
    private final Name name;
    private Position position;

    /**
    * 프로덕션용 생성자
    * */
    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    /**
    * 테스트용 생성자
    * */
    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }


    public void move(Movable moveStrategy) {
        if(moveStrategy.createMovable()) {
            position.increase();
        }
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String getName() {
        return name.getName();
    }

    public boolean hasGreaterPosition(int position) {
        return this.position.isGreatherPosition(position);
    }


    public boolean hasMaxPosition(int max) {
        return this.position.isMax(max);
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
