package com.mycompany.wackyraces;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.Game;

public class GameImpl extends Game {
	
	BoardImpl board;
	List<PlayerImpl> playerList;
	
	public GameImpl() {
		board = new BoardImpl();
		playerList = new ArrayList<>();
	}

}
