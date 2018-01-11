package testUnitaire.java.state;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Context;
import main.java.TCPServer;
import main.java.state.concrete.State3;
import main.java.state.concrete.State4;

public class State4Test {

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
	public void testConstructeur() {
		State4 s = State4.getInstance(aContext);
		assertEquals(s.getTransitionSet().size(),4);
		
	}
	
	@Test 
	public void testGetInstance1()
	{
		State4 s = State4.getInstance(aContext);
		assertNotNull(s.instance);
	}
	
	@Test 
	public void testGetInstance2()
	{
		State4 s = State4.getInstance(aContext);
		State4 s2 = State4.getInstance(aContext);
		assertEquals(s,s2);
	}

}
