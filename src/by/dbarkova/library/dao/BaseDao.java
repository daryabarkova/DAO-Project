package by.dbarkova.library.dao;

import java.util.List;

import by.dbarkova.library.bean.Entity;

public interface BaseDao<T extends Entity> { // только наследники класса Entity
	
     void create(T t);
     T read(int id);
     List<T> readAll();
     void update(T t);
     void delete(T t);

}
