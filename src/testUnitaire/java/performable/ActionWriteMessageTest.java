package testUnitaire.java.performable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.performable.concrete.ActionWriteMessage;

public class ActionWriteMessageTest {

	public ActionWriteMessage a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		a = ActionWriteMessage.getInstance();
		assertNotNull(ActionWriteMessage.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		a = ActionWriteMessage.getInstance();
		ActionWriteMessage b = ActionWriteMessage.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void testPerform()
	{
		fail("Not yet implemented");
	}

}
