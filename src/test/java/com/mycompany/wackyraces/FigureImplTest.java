package com.mycompany.wackyraces;

import org.junit.Test;

public class FigureImplTest {
	
	@Test
	public void testMove() {
		
		FigureImpl figure = new FigureImpl();
		try {
			figure.move(new FieldImpl());
		} catch (UnsupportedOperationException ex) {
			// if you implemented move operation, please make the junit test
		}
	}

}
