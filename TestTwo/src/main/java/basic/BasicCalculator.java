package basic;

public class BasicCalculator {

	public double calculate(double x, String operator, double y) {
		
		double result = 0;
		
		if(operator == "+") {
			result = x + y;
		} else if(operator == "-") {
			result = x - y;
		} else if(operator == "x") {
			result = x * y;
		} else if(operator == "/") {
			result = x / y;
		} else {
			System.out.println("Please use one of the operator: +  - x /");
		}
		
		return result;
	}
}
