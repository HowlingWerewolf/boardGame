package com.mycompany.wackyraces;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.FieldManager;

public class FieldManagerImpl extends FieldManager {
	
	List<FieldImpl> fieldList;

	public FieldManagerImpl() {
		fieldList = new ArrayList<>();
	}
	
	
	public void addField(FieldImpl field){
		fieldList.add(field);
	}
	
	
	public FieldImpl getFieldById(int id){
		
		for (FieldImpl fieldImpl : fieldList) {
			if (fieldImpl.getId() == id) {
				return fieldImpl;
			}
		}
		return null;	
	}
	

	public List<FieldImpl> getFieldList() {
		return fieldList;
	}
	
	
	public int getMaxId() {
		
		int max = Integer.MIN_VALUE;
		for (FieldImpl fieldImpl : fieldList) {
			if (fieldImpl.getId() > max) {
				max = fieldImpl.getId();
			}
		}
		return max;
	}
	
}
