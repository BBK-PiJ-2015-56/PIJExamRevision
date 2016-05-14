package testpackage;

import org.junit.*;
import static org.junit.Assert.*;

public class MockTest {
	@Test
	public void testsName() {
		String input = "Dereck Robert Yssirt";
		String output = "Dereck Robert Yssirt";
		assertEquals(output, input);
	}
}
