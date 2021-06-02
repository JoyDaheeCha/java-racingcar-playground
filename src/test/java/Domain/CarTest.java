package Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    public void Car_이름은_5자_이하() {
        assertThatThrownBy(() -> new Car("crongcrong")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Car("")).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertDoesNotThrow(()->new Car("crong"));
    }

    @Test
    public void Car_move_정상테스트_input이_true면_전진_false면_멈춤() {
        Car crong = new Car("crong");
        crong.move(true);
        Car hounux = new Car("honux");
        hounux.move(false);
        assertThat(crong.getPosition()).isEqualTo(1);
        assertThat(hounux.getPosition()).isEqualTo(0);
    }


}

