package Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarsTest {
    @Test
    public void Cars_초기화() {
        Car crong = new Car("crong");
        Car honux = new Car("honux");
        Car pobi = new Car("pobi");
        Assertions.assertDoesNotThrow(()-> new Cars(Arrays.asList(crong, honux, pobi)));
    }
}
