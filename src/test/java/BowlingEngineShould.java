import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alvaro on 24/03/15.
 */
public class BowlingEngineShould {

	@Test
	public void return_0_when_no_pins_touched(){
		assertThat(throwBalls(0,0), is(0));
	}
}
