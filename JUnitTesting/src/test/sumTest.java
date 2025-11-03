package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
UnitTesting unit = new UnitTesting();
		
		int num = unit.sum(5, 10);		
		
		assertEquals(15, num);
	}

}
