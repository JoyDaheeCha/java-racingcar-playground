package Domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    @Test
    public void Race_getWinnerTest_우승은_pobi(){
        Car crong = new Car("crong");
        Car honux = new Car("honux");
        Car pobi = new Car("pobi");
        Cars cars = new Cars(Arrays.asList(crong,honux,pobi));
        Movable moveTrue = () -> true;
        crong.move(moveTrue);
        honux.move(moveTrue);
        pobi.move(moveTrue);
        pobi.move(moveTrue);
        assertThat(cars.getWinner()).isEqualTo(Arrays.asList(pobi));
    }
}
