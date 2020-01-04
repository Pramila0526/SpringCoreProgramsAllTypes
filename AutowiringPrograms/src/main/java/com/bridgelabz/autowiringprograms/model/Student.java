package com.bridgelabz.autowiringprograms.model;
import org.springframework.beans.factory.annotation.Autowired;
/*******************************************************************************************************
 * @author 	: Pramila Tawari
 * Purpose	: Student Class having dependency of Book
 *
 *********************************************************************************************/
public class Student {
	private Book book;

	public Student(Book book) {
		this.book = book;
		System.out.println("Setter Method Called");
	}
	@Autowired
	public void setBook(Book book) {
		this.book = book;
	}
	public void startReading() {
		if (book != null) {
			book.read();
		} else {
			System.out.println("Getting Bored");
		}
	}

}
