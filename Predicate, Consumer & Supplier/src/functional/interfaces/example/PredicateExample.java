package functional.interfaces.example;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (num) -> {
			if(num % 2 == 0)
				return true;
			else
				return false;
		};
		System.out.println("Predicate Result : " + predicate.test(198));
	}
}
