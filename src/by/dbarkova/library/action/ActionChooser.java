package by.dbarkova.library.action;

public final class ActionChooser {
	
	public static BaseAction chooseAction(int action){
		
		// problem with NPE
		BaseAction act = null;
		switch(action){
		case 1:
			act = new ViewBookListAction();
			break;
		case 2:
			act = new SomeSimpleAction();
			break;
		default:
		    break;
		}
		return act;
	}

}
