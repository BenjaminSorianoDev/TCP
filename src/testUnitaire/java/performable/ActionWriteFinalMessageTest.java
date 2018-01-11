package testUnitaire.java.performable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.performable.concrete.ActionWriteFinalMessage;

public class ActionWriteFinalMessageTest {

	public ActionWriteFinalMessage a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		a = ActionWriteFinalMessage.getInstance();
		assertNotNull(ActionWriteFinalMessage.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		a = ActionWriteFinalMessage.getInstance();
		ActionWriteFinalMessage b = ActionWriteFinalMessage.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void testPerform()
	{
		fail("Not yet implemented");
	}

}
