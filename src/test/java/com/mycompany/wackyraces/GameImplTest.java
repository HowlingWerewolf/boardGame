package com.mycompany.wackyraces;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameImplTest {
	
	@Test
	public void testGame() {
		
		GameImpl game = new GameImpl();
		BoardImpl board = game.board;
		FieldManagerImpl fieldManager = board.fieldManager;
		
		
		fieldManager.addField(new FieldImpl(1, "Start"));
		
		for (int i = 2; i < 12; i++) {
			fieldManager.addField(new FieldImpl(i, "Noname"));			
		}
		
		fieldManager.addField(new FieldImpl(12, "Finish"));
		
		PlayerImpl player1 = new PlayerImpl();
		PlayerImpl player2 = new PlayerImpl();
		
		game.playerList.add(player1);
		game.playerList.add(player2);
		
		// TODO: figure name could be placed in figureImpl		
		FigureImpl penelopeFigure = new FigureImpl(fieldManager, fieldManager.getFieldById(1));
		FigureImpl dastardlyFigure = new FigureImpl(fieldManager, fieldManager.getFieldById(1));
		
		player1.figure = penelopeFigure;
		player2.figure = dastardlyFigure;
		
		// TODO: this will be a WinningCondition
		while(penelopeFigure.getField().getId() != 12 || dastardlyFigure.getField().getId() != 12){
			player1.doTurn();

			System.out.println("Player1 rolls...");
			System.out.println("Penelope Pitstop moves to field " + player1.figure.getField().getId());

			player2.doTurn();

			System.out.println("Player2 rolls...");
			System.out.println("Dick Dastardly moves to field " + player2.figure.getField().getId());
		}
		
		
		System.out.println(board.toString());		
		assertTrue(board.toString() != "");
	}

}
