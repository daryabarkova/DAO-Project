package by.dbarkova.library.dao;

import java.util.List;

import by.dbarkova.library.bean.Author;

public interface BookDao<Book> extends BaseDao{
	
	List<Book> readByAuthor(Author auth);

}
