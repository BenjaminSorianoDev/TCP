package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T331;

public class T331Test {


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
	public void testT331() {
		T331 t = aContext.getaConcreteFactory().createT331();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T331 s = aContext.getaConcreteFactory().createT331();
		assertNotNull(T331.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T331 s = aContext.getaConcreteFactory().createT331();
		T331 s2 = aContext.getaConcreteFactory().createT331();
		assertEquals(s,s2);
	}


}
