package by.dbarkova.library.dao.file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.dbarkova.library.bean.Author;
import by.dbarkova.library.bean.Book;
import by.dbarkova.library.bean.Entity;
import by.dbarkova.library.dao.BookDao;

public class BookFileDaoImpl implements BookDao<Book>{

	@Override
	public void create(Entity t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entity read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> readAll() {
		
		Author auth = new Author("Name1", "Surname1", new Date());
		
		Book book1 = new Book(1, "Book1", auth);
		Book book2 = new Book(1, "Book2", auth);
		Book book3 = new Book(1, "Book3", auth);
		
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		return books;
	}

	@Override
	public void update(Entity t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Entity t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> readByAuthor(Author auth) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
