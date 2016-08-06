package com.mycompany.wackyraces;

import org.junit.Test;

public class PlayerImplTest {
	
	@Test
	public void testMove() {
		
		PlayerImpl player = new PlayerImpl();
		
		// TODO: use mockito instead using other classes!	
		FieldManagerImpl fieldManager = new FieldManagerImpl();
		FieldImpl startField = new FieldImpl(1, "Start");
		FieldImpl finishField = new FieldImpl(2, "Finish");
		fieldManager.fieldList.add(startField);
		fieldManager.fieldList.add(finishField);
		
		FigureImpl penelopeFigure = new FigureImpl(fieldManager, startField);
		
		player.figure = penelopeFigure;
		
		player.doTurn();
	}

}
