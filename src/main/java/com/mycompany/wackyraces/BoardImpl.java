package com.mycompany.wackyraces;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.Board;

public class BoardImpl extends Board {
	
	List<FieldImpl> fieldList;
	
	public BoardImpl() {
		fieldList = new ArrayList<>();
	}

}
