package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T44;

public class T44Test {


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
	public void testT44() {
		T44 t = aContext.getaConcreteFactory().createT44();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T44 s = aContext.getaConcreteFactory().createT44();
		assertNotNull(T44.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T44 s = aContext.getaConcreteFactory().createT44();
		T44 s2 = aContext.getaConcreteFactory().createT44();
		assertEquals(s,s2);
	}


}
