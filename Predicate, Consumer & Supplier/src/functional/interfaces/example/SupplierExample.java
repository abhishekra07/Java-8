package functional.interfaces.example;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Returned String from Supplier";
		System.out.println(supplier.get());
	}
}
