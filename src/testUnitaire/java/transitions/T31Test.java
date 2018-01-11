package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T31;

public class T31Test {

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
	public void testT31() {
		T31 t = aContext.getaConcreteFactory().createT31();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T31 s = aContext.getaConcreteFactory().createT31();
		assertNotNull(s.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T31 s = aContext.getaConcreteFactory().createT31();
		T31 s2 = aContext.getaConcreteFactory().createT31();
		assertEquals(s,s2);
	}

}
