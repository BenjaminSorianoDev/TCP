package testUnitaire.java.satisfiable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.satisfiable.concrete.AckEvent;

public class AckEventTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		AckEvent a = AckEvent.getInstance();
		assertNotNull(AckEvent.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		AckEvent a = AckEvent.getInstance();
		AckEvent b = AckEvent.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void isSatisfiedTrue() {
		AckEvent c = AckEvent.getInstance();
		assertTrue(c.isSatisfied(new Context(new TCPServer())));
	}
	
	@Test
	public void isSatisfiedFalse() {
		Context context = new Context(new TCPServer());
		AckEvent c = AckEvent.getInstance();
		assertFalse(c.isSatisfied(context));
	}
}
