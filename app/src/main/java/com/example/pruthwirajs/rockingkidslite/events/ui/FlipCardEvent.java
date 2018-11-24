package com.example.pruthwirajs.rockingkidslite.events.ui;


import com.example.pruthwirajs.rockingkidslite.events.AbstractEvent;
import com.example.pruthwirajs.rockingkidslite.events.EventObserver;

/**
 * When the 'back to menu' was pressed.
 */
public class FlipCardEvent extends AbstractEvent {

	public static final String TYPE = FlipCardEvent.class.getName();

	public final int id;
	
	public FlipCardEvent(int id) {
		this.id = id;
	}
	
	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
