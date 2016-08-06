package com.mycompany.model;

import java.util.List;

import com.mycompany.model.gamegoal.LosingCondition;
import com.mycompany.model.gamegoal.WinningCondition;

public abstract class Player implements PlayerActions{
	
	List<LosingCondition> losingCondition;
	List<WinningCondition> winningCondition;

}
