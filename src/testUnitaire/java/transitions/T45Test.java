package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T45;

public class T45Test {


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
	public void testT45() {
		T45 t = aContext.getaConcreteFactory().createT45();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T45 s = aContext.getaConcreteFactory().createT45();
		assertNotNull(T45.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T45 s = aContext.getaConcreteFactory().createT45();
		T45 s2 = aContext.getaConcreteFactory().createT45();
		assertEquals(s,s2);
	}


}
