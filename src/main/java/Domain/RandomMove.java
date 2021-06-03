package Domain;

import java.util.Random;

public class RandomMove implements Movable{
    @Override
    public boolean createMovable() {
        return new Random().nextBoolean();
    }
}
