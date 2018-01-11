package testUnitaire.java.performable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.performable.concrete.ActionOnAck;

public class ActionOnAckTest {

	public ActionOnAck a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		a = ActionOnAck.getInstance();
		assertNotNull(ActionOnAck.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		a = ActionOnAck.getInstance();
		ActionOnAck b = ActionOnAck.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void testPerform()
	{
		fail("Not yet implemented");
	}

}
