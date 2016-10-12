package com.mycompany.wackyraces;

import com.mycompany.model.Board;

public class BoardImpl extends Board {
	
	FieldManagerImpl fieldManager;
	
	public BoardImpl() {
		fieldManager = new FieldManagerImpl();
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("Board created with these fields:");
		strBuilder.append("\n");
		
		for (FieldImpl fieldImpl : fieldManager.getFieldList()) {
			strBuilder.append("" + fieldImpl.getId() + ": " + fieldImpl.getText());
			strBuilder.append("\n");
		}
		
		return strBuilder.toString();
	}

}
