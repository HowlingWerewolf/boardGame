package com.mycompany.model;

/**
 * 
 * @author Gavi
 * Either you can use a field instantiation as a physical field, or you can use it as a technical field.
 * 
 * For e.g.: there are M figures in a game, controlled by N player. Each figure is on a field. 
 * What if one figure is killed? That figure will be placed out of game, on a field: 'dead' field.
 * If a figure can be resurrected somehow, we can use the 'resurrectable' field.
 *
 */
public abstract class Field {
	
	public Field() {
		// TODO Auto-generated constructor stub
	}
	
}
