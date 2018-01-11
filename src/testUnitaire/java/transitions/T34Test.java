package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T34;

public class T34Test {


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
	public void testT34() {
		T34 t = aContext.getaConcreteFactory().createT34();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T34 s = aContext.getaConcreteFactory().createT34();
		assertNotNull(T34.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T34 s = aContext.getaConcreteFactory().createT34();
		T34 s2 = aContext.getaConcreteFactory().createT34();
		assertEquals(s,s2);
	}


}
