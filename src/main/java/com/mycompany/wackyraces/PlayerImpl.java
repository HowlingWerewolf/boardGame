package com.mycompany.wackyraces;

import com.mycompany.model.Dice;
import com.mycompany.model.Player;

public class PlayerImpl extends Player {
	
	FigureImpl figure;

	public PlayerImpl() {
		figure = new FigureImpl(null, null);
	}
	
	
	@Override
	public void doTurn() {
		
		int rollValue = roll();
		moveFigure(rollValue);
	}
	

	private int roll() {
		
		// TODO: Dice could be instantiated by a factory pattern!
		// TODO: 6 is a magic number
		Dice dice = new Dice(6);
		return dice.roll(1);
	}
	

	private void moveFigure(int rollValue) {
		
		FieldImpl from = figure.fieldManager.getFieldById(figure.getField().getId());
		FieldImpl dest = figure.fieldManager.getFieldById(figure.getField().getId() + rollValue);
		
		// we cannot place the figure to nowhere, let it 
		if (from.getId() + rollValue > figure.fieldManager.getMaxId()) {
			dest = figure.fieldManager.getFieldById(figure.fieldManager.getMaxId());
		}
		
		figure.setField(dest);		
	}
	

	public FigureImpl getFigure() {
		return figure;
	}
	

	public void setFigure(FigureImpl figure) {
		this.figure = figure;
	}
	
}
