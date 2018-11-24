package com.example.pruthwirajs.rockingkidslite.common;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.example.pruthwirajs.rockingkidslite.engine.Engine;
import com.example.pruthwirajs.rockingkidslite.events.EventBus;


public class Shared {

	public static Context context;
	public static FragmentActivity activity; // it's fine for this app, but better move to weak reference
	public static Engine engine;
	public static EventBus eventBus;

}
