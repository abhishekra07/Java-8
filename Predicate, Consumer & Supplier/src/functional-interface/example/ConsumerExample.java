package lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (num) -> System.out.println("number is -> " + num);
		consumer.accept(100);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		this for each method accepts as consumer hence i am passing consumer function
		numbers.forEach(consumer);
	}

}