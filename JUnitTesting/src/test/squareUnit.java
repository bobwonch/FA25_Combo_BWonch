package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		UnitTesting unit = new UnitTesting();
		
		int num = unit.square(4);
		
		
		
		assertEquals(16, num);
		
	}

}
