package testUnitaire.java.satisfiable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.performable.concrete.ActionForReset;
import main.java.satisfiable.concrete.AbortEvent;

public class AbortEventTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		AbortEvent a = AbortEvent.getInstance();
		assertNotNull(AbortEvent.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		AbortEvent a = AbortEvent.getInstance();
		AbortEvent b = AbortEvent.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void isSatisfiedTrue() {
		AbortEvent c = AbortEvent.getInstance();
		assertTrue(c.isSatisfied(new Context(new TCPServer())));
	}
	
	@Test
	public void isSatisfiedFalse() {
		Context context = new Context(new TCPServer());
		AbortEvent c = AbortEvent.getInstance();
		assertFalse(c.isSatisfied(context));
	}

}
