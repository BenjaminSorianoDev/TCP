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
	public void testGetInstance() {
		a = ActionForReset.getInstance();
		assertNotNull(a.instance);
	}
	
	@Test
	public void testGetInstanceUnique()
	{
		a = ActionForReset.getInstance();
		ActionForReset b = ActionForReset.getInstance();
		assertEquals(a, b);
	}

}
