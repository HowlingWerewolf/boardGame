package com.mycompany.wackyraces;

import com.mycompany.model.Field;
import com.mycompany.model.Figure;

public class FigureImpl extends Figure {
	
	FieldManagerImpl fieldManager;
	
	public FigureImpl(FieldManagerImpl fieldManager, Field dest){
		this.fieldManager = fieldManager;
		move(dest);
	}
	

	@Override
	public void move(Field dest) {
		this.field = (FieldImpl) dest;
	}
	
	
	@Override
	public FieldImpl getField() {
		return (FieldImpl) field;
	}
	

	public FieldManagerImpl getFieldManager() {
		return fieldManager;
	}
	

	public void setFieldManager(FieldManagerImpl fieldManager) {
		this.fieldManager = fieldManager;
	}

}
