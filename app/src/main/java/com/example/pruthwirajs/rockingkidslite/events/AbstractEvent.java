package com.example.pruthwirajs.rockingkidslite.events;

public abstract class AbstractEvent implements Event {

	protected abstract void fire(EventObserver eventObserver);

}
