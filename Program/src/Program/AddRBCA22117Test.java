package Program;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddRBCA22117Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	private AddRBCA22117 AddRBCA22117adder;

	@Before
	public void setUp() throws Exception {
	}
@After
	public void tearDown() throws Exception {
	}

	
		@Test
		public void testSum() {
			
			AddRBCA22117adder = new AddRBCA22117();
		        AddRBCA22117 adder = null;
				int result = adder.sum(3, 5);
		        assertEquals(8, result);
		    }
		@Test
	    public void testAddWithNegativeNumbers() {
			AddRBCA22117 adder = new AddRBCA22117();
	        int result = adder.sum(-3, -5);
	        assertEquals(-8, result);
}
}
