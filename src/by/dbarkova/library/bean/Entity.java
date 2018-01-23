package by.dbarkova.library.bean;

public abstract class Entity {
	
	private int id;

	public Entity() {
		super();
	}

	public Entity(int id) {
		super();
		id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

}
