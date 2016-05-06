package org.vashonsd.pirateship.creature;

import org.vashonsd.pirateship.commands.*;
import org.vashonsd.pirateship.interactions.Actor;

public class Creature extends Actor {

	public Creature(String name, String description, String splash) {
		super(name, description, splash);
		this.enrollCommand(new Examine());
		this.enrollCommand(new Harm());
		this.setAlive(true);
	}	
}
