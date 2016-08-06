package com.mycompany.model;

public abstract class Figure implements FigureActions {

	protected Field field;
	
	public Figure() {
	}
	
	public Figure(Field field){
		this.field = field;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}
	
}
