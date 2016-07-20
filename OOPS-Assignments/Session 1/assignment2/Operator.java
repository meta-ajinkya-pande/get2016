package assignment2;

public class Operator {
	
	int operatorId;
	double result;
	
	public Operator(int operatorId) {
		super();
		this.operatorId = operatorId;
	}
	
	// Performs opperations according to operator id
	public void performOperation(){	
	}
	
	// Getting the operator id
	public int getOperatorId() {
		return operatorId;
	}

	// Setting the operator id
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	// send the final result 
	public double getResult() {
		return result;
	}
	
}
