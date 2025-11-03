package unitTests;

import static org.junit.Assert.*;
import code.Time;

import org.junit.Test;

public class hourUnit {

	@Test
	public void test() {
		Time time = new Time(6,45,30);
		
		int hour = time.getHour();
		
		assertEquals(6, hour);
		
		
	}

}
