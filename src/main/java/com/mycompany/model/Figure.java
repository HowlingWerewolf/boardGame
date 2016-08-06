package com.mycompany.model;

public abstract class Figure implements FigureActions {

	Field field;
	
	public Figure() {
		// TODO Auto-generated constructor stub
	}
	
	public Figure(Field field){
		this.field = field;
	}
}
