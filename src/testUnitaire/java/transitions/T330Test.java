package testUnitaire.java.transitions;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.transition.concrete.T330;

public class T330Test {


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
	public void testT330() {
		T330 t = aContext.getaConcreteFactory().createT330();
		assertEquals(t.getaContext(),aContext);
	}
	
	@Test 
	public void testGetInstance1()
	{
		T330 s = aContext.getaConcreteFactory().createT330();
		assertNotNull(T330.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		T330 s = aContext.getaConcreteFactory().createT330();
		T330 s2 = aContext.getaConcreteFactory().createT330();
		assertEquals(s,s2);
	}


}
