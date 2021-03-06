package testUnitaire.java.performable;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import  main.java.performable.concrete.ActionForReset;
public class ActionForResetTest {

	public ActionForReset a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetInstance1() {
		a = ActionForReset.getInstance();
		assertNotNull(ActionForReset.instance);
	}
	
	@Test
	public void testGetInstance2()
	{
		a = ActionForReset.getInstance();
		ActionForReset b = ActionForReset.getInstance();
		assertEquals(a, b);
	}
	
	@Test
	public void testPerform()
	{
		fail("Not yet implemented");
	}

}
