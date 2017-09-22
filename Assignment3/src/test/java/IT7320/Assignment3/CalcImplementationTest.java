package IT7320.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
		
	CalcImplementation obj;
	int x,y;

	protected void setUp() throws Exception {
		
		obj=new CalcImplementation();	
		x=7;y=10;
		
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x+y);
		
		obj.setObjInterface(mockObj);
				
	}

	protected void tearDown() throws Exception {
				
		obj=null;
		x=0;y=0;
		
	}

	public void testAddTwoNumbers() {
		
		assertEquals(17,obj.addTwoNumbers(x, y));
		
		
	}

}
