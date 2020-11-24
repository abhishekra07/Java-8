package lambda.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("First Book",1));
		books.add(new Book("Second Book",2));
		books.add(new Book("Third Book",3));
		books.add(new Book("Forth Book",4));
		Collections.sort(books, new CustomConparator());
		System.out.println("list " + books);
	}

}

class  CustomConparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getName().compareTo(book2.getName());
	}
}

class Book {
	private String name;
	private int id;
	
	public Book(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + "]";
	}
}
