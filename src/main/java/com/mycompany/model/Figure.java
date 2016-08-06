package com.mycompany.model;

public abstract class Figure implements FigureActions {

	Position position;
	
	public Figure() {
		// TODO Auto-generated constructor stub
	}
	
	public Figure(Position position){
		this.position = position;
	}
}
