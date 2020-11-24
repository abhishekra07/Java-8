package custom.lambda.example;

public class CustomLambdaExpressionUsingFunctionalInterface {

	public static void main(String[] args) {
		long number1 = 100;
		long number2 = 139;
		SumInterface sum = (num1, num2) -> num1 + num2;
		System.out.println("Sum Using Functional Interface & Lambda Expression :- " + sum.add(number1, number2));
		
		float n1 = 100;
		float n2 = 200;
		DivideInterface divide = (num1, num2) -> {
			if(num2 == 0) {
				throw new RuntimeException("divide by zero expetion");
			}else {
				return num1 / num2;
			}
		};
		System.out.println("Divide Using Functional Interface & Lambda Expression :- " + divide.divide(n1, n2));
	}
}

interface SumInterface {
	long add(long value1, long value2);
}

interface DivideInterface {
	float divide(float value1, float value2);
}
