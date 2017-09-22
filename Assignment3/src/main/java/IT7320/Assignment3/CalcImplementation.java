package IT7320.Assignment3;

public class CalcImplementation {
	
	CalcInterface objInterface;
	
	public int addTwoNumbers(int a,int b) {
		
		return objInterface.add(a, b);
				
	}

	public CalcInterface getObjInterface() {
		return objInterface;
	}

	public void setObjInterface(CalcInterface objInterface) {
		this.objInterface = objInterface;
	}

}
