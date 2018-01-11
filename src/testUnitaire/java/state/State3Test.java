package testUnitaire.java.state;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.state.*;
import main.java.state.concrete.State3;

public class State3Test {

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

	/*@Test
	public void testConstructeur() {
		State3 s = State3.getInstance(aContext);
		assertEquals(s.getTransitionSet().size(),5);
		
	}*/
	
	@Test 
	public void testGetInstance1()
	{
		State3 s = aContext.getaConcreteFactory().createState3();
		assertNotNull(s.instance);
	}
	
/*	@Test 
	public void testGetInstance2()
	{
		State3 s = State3.getInstance(aContext);
		State3 s2 = State3.getInstance(aContext);
		assertEquals(s,s2);
	}*/

}
