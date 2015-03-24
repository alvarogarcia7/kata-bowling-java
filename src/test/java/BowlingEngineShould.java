import com.example.kata.bowling.BowlingEngine;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alvaro on 24/03/15.
 */
public class BowlingEngineShould {

	@Test
	public void return_0_when_no_pins_touched(){
		assertThat(new BowlingEngine().throwBalls(0, 0), is(0));
	}

	@Test
	public void display_1_when_the_first_ball_drop_1_pin(){
		assertThat(new BowlingEngine().throwBalls(1), is(1));
	}

}
