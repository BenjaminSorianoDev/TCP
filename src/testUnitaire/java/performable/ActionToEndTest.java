package testUnitaire.java.performable;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.performable.concrete.ActionToEnd;

public class ActionToEndTest {

	public ActionToEnd a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		a = ActionToEnd.getInstance();
		assertNotNull(ActionToEnd.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		a = ActionToEnd.getInstance();
		ActionToEnd b = ActionToEnd.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void testPerform()
	{
		fail("Not yet implemented");
	}

}
