package com.mycompany.wackyraces;

import com.mycompany.model.Field;
import com.mycompany.model.Position;

public class PositionImpl extends Position {
	
	Field field;

	public PositionImpl() {
	}
	
	public PositionImpl(Field field){
		this.field = field;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}
	
	
	
}
