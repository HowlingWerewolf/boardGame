package com.mycompany.wackyraces;

import org.junit.Test;

public class PlayerImplTest {
	
	@Test
	public void testMove() {
		
		PlayerImpl player = new PlayerImpl();
		try {
			player.doTurn();
		} catch (UnsupportedOperationException ex) {
			// if you implemented move operation, please make the junit test
		}
	}

}
