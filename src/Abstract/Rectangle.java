package Abstract;

import java.util.Scanner;

public class Rectangle extends Calculation {

	private int result;
	
	public Rectangle(int result ) {
		this.result=result;
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(result, 2);
	}

	@Override
	public double getPrimeter() {
		// TODO Auto-generated method stub
		return result*4;
	}
	
}
