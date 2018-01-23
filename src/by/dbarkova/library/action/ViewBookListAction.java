package by.dbarkova.library.action;

import java.util.List;

import by.dbarkova.library.bean.Book;
import by.dbarkova.library.dao.BookDao;
import by.dbarkova.library.dao.file.BookFileDaoImpl;

public class ViewBookListAction implements BaseAction{

	private BookDao<Book> dao = new BookFileDaoImpl();
	@Override
	public void performAction() {
		List<Book> books = dao.readAll();		
	
	//STUB
	for(Book book : books){
		System.out.println(book);
	}
  }
}


