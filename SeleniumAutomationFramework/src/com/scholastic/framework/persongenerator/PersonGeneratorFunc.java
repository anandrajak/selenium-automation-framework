package com.scholastic.framework.persongenerator;

import com.scholastic.framework.exceptionhandling.ExceptionController;

public abstract class PersonGeneratorFunc {

	private PersonGeneratorController g_objController;
	public PersonGeneratorController getController () {
		if (null == this.g_objController) {
			this.g_objController = PersonGeneratorController.getInstance();
		}
		return this.g_objController;
	}
	
	public void setController (PersonGeneratorController prm_objController) {
		this.g_objController = prm_objController;
	}
	
	protected void handleException (Exception prm_exException) {
		ExceptionController.getInstance().handleException(prm_exException);
	}
	abstract public void startFunction();

}