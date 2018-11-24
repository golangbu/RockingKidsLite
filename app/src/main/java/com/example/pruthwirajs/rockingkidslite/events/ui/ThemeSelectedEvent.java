package com.example.pruthwirajs.rockingkidslite.events.ui;


import com.example.pruthwirajs.rockingkidslite.events.AbstractEvent;
import com.example.pruthwirajs.rockingkidslite.events.EventObserver;
import com.example.pruthwirajs.rockingkidslite.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
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
