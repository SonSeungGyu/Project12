package collection.quiz;

import java.util.ArrayList;

public class Quiz3 {
	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(new Book(1,"모험1"));
		list.add(new Book(2,"모험2"));
		list.add(new Book(3,"모험3"));
		System.out.println("book list 크기: " + list.size());
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		list.remove(0);
		list.remove(1);
		list.remove(2);
		
		list.remove(0);//중간에 있던 요소가 삭제하면 
		list.remove(0);
		list.remove(0);
	}
}


class Book{
	int bookNum;
	String title;
	
	public Book(int bookNum, String title) {
		super();
		this.bookNum = bookNum;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", title=" + title + "]";
	}
	
	
	
}
