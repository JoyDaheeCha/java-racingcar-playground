package RacingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    public void car_자동차_이름은_5자를_초과할_수_없다() {
        assertThatThrownBy(() -> new Car("pobipobi")).isInstanceOf(RuntimeException.class);
    }
}
