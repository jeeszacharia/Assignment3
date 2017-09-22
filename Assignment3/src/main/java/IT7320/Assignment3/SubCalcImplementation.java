package IT7320.Assignment3;

public class SubCalcImplementation {
	
	CalcInterface objInterface;
	
	public int subtwoNumbers(int subC,int subD) {
		return objInterface.substract(subC, subD);
				
	}

	public CalcInterface getObjInterface() {
		return objInterface;
	}

	public void setObjInterface(CalcInterface objInterface) {
		this.objInterface = objInterface;
	}

}
