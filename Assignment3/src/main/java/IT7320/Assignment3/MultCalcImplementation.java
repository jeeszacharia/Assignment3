package IT7320.Assignment3;

public class MultCalcImplementation {
	
	CalcInterface objInterface;
	
	public int multi(int multC,int multD) {
		
		return objInterface.multiplication(multC, multD);
		
		
	}

	public CalcInterface getObjInterface() {
		return objInterface;
	}

	public void setObjInterface(CalcInterface objInterface) {
		this.objInterface = objInterface;
	}
	

}
