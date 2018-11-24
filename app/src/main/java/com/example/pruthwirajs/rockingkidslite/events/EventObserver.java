package com.example.pruthwirajs.rockingkidslite.events;


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

public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
