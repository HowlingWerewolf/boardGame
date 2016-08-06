package com.mycompany.wackyraces;

import com.mycompany.model.Field;

public class FieldImpl extends Field {

	int id;
	String text;
	
	public FieldImpl(int label, String text) {
		this.id = label;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
