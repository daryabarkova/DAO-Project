package by.dbarkova.library.controller;

import by.dbarkova.library.action.ActionChooser;
import by.dbarkova.library.action.BaseAction;

public class ConsoleMainController {

	public static void main(String[] args) {
		
		// STUB
		int action = 1;
		
		BaseAction act = ActionChooser.chooseAction(action);
		act.performAction();

	}

}
