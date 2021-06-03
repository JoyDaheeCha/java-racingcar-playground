package Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    public void Cars_초기화() {
        Car crong = new Car("crong");
        Car honux = new Car("honux");
        Car pobi = new Car("pobi");
        Assertions.assertDoesNotThrow(()-> new Cars(Arrays.asList(crong, honux, pobi)));
    }

    @Test
    public void Cars_getWinner_테스트() {
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 2);
        Car pobi = new Car("pobi", 2);
        assertThat(new Cars(Arrays.asList(crong,honux,pobi)).getWinner()).isEqualTo(Arrays.asList(honux,pobi));
    }
}
