package testUnitaire.java.satisfiable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.satisfiable.concrete.ResetEvent;

public class ResetEventTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		ResetEvent a = ResetEvent.getInstance();
		assertNotNull(ResetEvent.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		ResetEvent a = ResetEvent.getInstance();
		ResetEvent b = ResetEvent.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void isSatisfiedTrue() {
		ResetEvent c = ResetEvent.getInstance();
		assertTrue(c.isSatisfied(new Context(new TCPServer())));
	}
	
	@Test
	public void isSatisfiedFalse() {
		Context context = new Context(new TCPServer());
		ResetEvent c = ResetEvent.getInstance();
		assertFalse(c.isSatisfied(context));
	}

}
