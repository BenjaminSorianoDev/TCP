package testUnitaire.java.satisfiable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.satisfiable.concrete.TimeOverEvent;

public class TimeOverEventTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		TimeOverEvent a = TimeOverEvent.getInstance();
		assertNotNull(TimeOverEvent.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		TimeOverEvent a = TimeOverEvent.getInstance();
		TimeOverEvent b = TimeOverEvent.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void isSatisfiedTrue() {
		TimeOverEvent c = TimeOverEvent.getInstance();
		assertTrue(c.isSatisfied(new Context(new TCPServer())));
	}
	
	@Test
	public void isSatisfiedFalse() {
		Context context = new Context(new TCPServer());
		TimeOverEvent c = TimeOverEvent.getInstance();
		assertFalse(c.isSatisfied(context));
	}

}
