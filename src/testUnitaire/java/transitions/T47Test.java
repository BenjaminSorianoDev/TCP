package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T47;

public class T47Test {


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
	public void testT47() {
		T47 t = aContext.getaConcreteFactory().createT47();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T47 s = aContext.getaConcreteFactory().createT47();
		assertNotNull(T47.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T47 s = aContext.getaConcreteFactory().createT47();
		T47 s2 = aContext.getaConcreteFactory().createT47();
		assertEquals(s,s2);
	}


}
