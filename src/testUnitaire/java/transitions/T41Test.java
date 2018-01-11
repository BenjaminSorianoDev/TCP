package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T41;

public class T41Test {


	static TCPServer t;
	static Context aContext;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		t = new TCPServer();
		aContext  = new Context(t);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testT41() {
		T41 t = aContext.getaConcreteFactory().createT41();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T41 s = aContext.getaConcreteFactory().createT41();
		assertNotNull(T41.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T41 s = aContext.getaConcreteFactory().createT41();
		T41 s2 = aContext.getaConcreteFactory().createT41();
		assertEquals(s,s2);
	}


}
