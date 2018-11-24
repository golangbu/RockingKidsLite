package com.example.pruthwirajs.rockingkidslite;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.example.pruthwirajs.rockingkidslite.common.Shared;
import com.example.pruthwirajs.rockingkidslite.engine.Engine;
import com.example.pruthwirajs.rockingkidslite.engine.ScreenController;
import com.example.pruthwirajs.rockingkidslite.events.EventBus;
import com.example.pruthwirajs.rockingkidslite.events.ui.BackGameEvent;
import com.example.pruthwirajs.rockingkidslite.ui.PopupManager;
import com.example.pruthwirajs.rockingkidslite.utils.Utils;


public class MainActivity extends FragmentActivity {

	private ImageView mBackgroundImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Shared.context = getApplicationContext();
		Shared.engine = Engine.getInstance();
		Shared.eventBus = EventBus.getInstance();

		setContentView(R.layout.activity_main);
		mBackgroundImage = (ImageView) findViewById(R.id.background_image);

		Shared.activity = this;
		Shared.engine.start();
		Shared.engine.setBackgroundImageView(mBackgroundImage);

		// set background
		setBackgroundImage();

		// set menu
		ScreenController.getInstance().openScreen(ScreenController.Screen.MENU);


	}

	@Override
	protected void onDestroy() {
		Shared.engine.stop();
		super.onDestroy();
	}

	@Override
	public void onBackPressed() {
		if (PopupManager.isShown()) {
			PopupManager.closePopup();
			if (ScreenController.getLastScreen() == ScreenController.Screen.GAME) {
				Shared.eventBus.notify(new BackGameEvent());
			}
		} else if (ScreenController.getInstance().onBack()) {
			super.onBackPressed();
		}
	}

	private void setBackgroundImage() {
		Bitmap bitmap = Utils.scaleDown(R.drawable.background, Utils.screenWidth(), Utils.screenHeight());
		bitmap = Utils.crop(bitmap, Utils.screenHeight(), Utils.screenWidth());
		bitmap = Utils.downscaleBitmap(bitmap, 2);
		mBackgroundImage.setImageBitmap(bitmap);
	}

}
