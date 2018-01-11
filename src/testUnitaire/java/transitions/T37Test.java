package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T37;

public class T37Test {


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
	public void testT37() {
		T37 t = aContext.getaConcreteFactory().createT37();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T37 s = aContext.getaConcreteFactory().createT37();
		assertNotNull(T37.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T37 s = aContext.getaConcreteFactory().createT37();
		T37 s2 = aContext.getaConcreteFactory().createT37();
		assertEquals(s,s2);
	}


}
