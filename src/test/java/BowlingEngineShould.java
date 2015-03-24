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
	public void display_1_when_the_first_ball_drops_1_pin(){
		assertThat(new BowlingEngine().throwBalls(1, 0), is(1));
	}

	@Test
	public void display_1_when_the_second_ball_drops_1_pin(){
		assertThat(new BowlingEngine().throwBalls(0, 1), is(1));
	}

	@Test
	public void not_mind_about_the_balls_results_order(){
		assertThat(new BowlingEngine().throwBalls(0, 1), is(new BowlingEngine().throwBalls(1, 0)));
	}

}
