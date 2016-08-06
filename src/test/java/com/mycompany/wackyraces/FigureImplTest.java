package com.mycompany.wackyraces;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureImplTest {
	
	@Test
	public void testMove() {

		// TODO: use mockito instead using other classes!	
		FieldManagerImpl fieldManager = new FieldManagerImpl();
		FieldImpl startField = new FieldImpl(1, "Start");
		FieldImpl finishField = new FieldImpl(2, "Finish");
		fieldManager.fieldList.add(startField);
		fieldManager.fieldList.add(finishField);
		
		FigureImpl figure = new FigureImpl(fieldManager, startField);
		
		figure.move(finishField);
		
		assertEquals(figure.getField(), finishField);
	}

}
