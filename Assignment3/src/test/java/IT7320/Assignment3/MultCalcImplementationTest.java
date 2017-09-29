package IT7320.Assignment3;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class MultCalcImplementationTest extends TestCase {
	
	MultCalcImplementation obj;
	int x,y;

	protected void setUp() throws Exception {
		
		obj= new MultCalcImplementation();
		x=5;
		y=2;
		
				
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.multiplication(x, y)).thenReturn(x*y);
		obj.setObjInterface(mockObj);
		
		
	}

	protected void tearDown() throws Exception {
		
		obj=null;
		x=0;
		y=0;
	
	}

	public void testMulti() {
		
	assertEquals(10,obj.multi(x,y));	
		
	}

}
