package au.com.bluemix.training.appb;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceBTest {

	@Test
	public void testPlus() {
		IServiceB serviceB = new ServiceB();
		int result = serviceB.minus(10, 10);
		assertEquals(0, result);
	}

}
