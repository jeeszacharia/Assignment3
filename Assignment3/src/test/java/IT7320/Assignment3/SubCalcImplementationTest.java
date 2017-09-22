package IT7320.Assignment3;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class SubCalcImplementationTest extends TestCase {
		
	SubCalcImplementation obj;
	
	int subX,subY;

	protected void setUp() throws Exception {
		obj=new SubCalcImplementation();
		subX=10;
		subY=5;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.substract(subX, subY)).thenReturn(subX-subY);
		
		obj.setObjInterface(mockObj);	
		
	}

	protected void tearDown() throws Exception {
		
		obj=null;
		subX=0;
		subY=0;
	
	}

	public void testSubtwoNumbers() {
		
		assertEquals(5,obj.subtwoNumbers(subX, subY));
	
	}

}
