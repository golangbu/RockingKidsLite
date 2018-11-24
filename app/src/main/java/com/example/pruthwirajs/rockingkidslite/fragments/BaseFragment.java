package com.example.pruthwirajs.rockingkidslite.fragments;

import android.support.v4.app.Fragment;

import com.example.pruthwirajs.rockingkidslite.events.EventObserver;
import com.example.pruthwirajs.rockingkidslite.events.engine.FlipDownCardsEvent;
import com.example.pruthwirajs.rockingkidslite.events.engine.GameWonEvent;
import com.example.pruthwirajs.rockingkidslite.events.engine.HidePairCardsEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.BackGameEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.DifficultySelectedEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.FlipCardEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.NextGameEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.ResetBackgroundEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.StartEvent;
import com.example.pruthwirajs.rockingkidslite.events.ui.ThemeSelectedEvent;


public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
