package IT7320.Assignment3;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class DivisionImplementationTest extends TestCase {
	
	DivisionImplementation obj;
	int x,y;
	double c,d;
	

	protected void setUp() throws Exception {
		
		obj= new DivisionImplementation();
		x=5;
		y=2;
		c=(double)x;
		d=(double)y;		 
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.devide(x, y)).thenReturn((double) (c/d));
		
		obj.setObj(mockObj);
		
				
	}

	protected void tearDown() throws Exception {
		
		obj= null;
		x=0;
		y=0;
		c=0;
		d=0;	
				
	}

	public void testDevivide() {
		
		assertEquals(2.5,obj.devivide(x, y));
		
	}

}
