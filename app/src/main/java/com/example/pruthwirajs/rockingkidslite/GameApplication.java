package com.example.pruthwirajs.rockingkidslite;

import android.app.Application;

import com.example.pruthwirajs.rockingkidslite.utils.FontLoader;


public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
