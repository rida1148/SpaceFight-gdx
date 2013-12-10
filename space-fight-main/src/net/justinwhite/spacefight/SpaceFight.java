package net.justinwhite.spacefight;

import net.justinwhite.spacefight.screens.IntroScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;

public class SpaceFight extends Game {

	public static final String log = SpaceFight.class.getSimpleName();
	private FPSLogger fpsLog;

	@Override
	public void create() {
		Gdx.app.log(SpaceFight.log, "Creating game.");
		fpsLog = new FPSLogger();

		setScreen(new IntroScreen(this));
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log(SpaceFight.log, "Resizing game to: " + width + " x "
				+ height);

	}

	@Override
	public void render() {
		super.render();
		fpsLog.log();
	}

	@Override
	public void pause() {
		Gdx.app.log(SpaceFight.log, "Pausing game");
	}

	@Override
	public void resume() {
		Gdx.app.log(SpaceFight.log, "Resuming game");
	}

	@Override
	public void dispose() {
		Gdx.app.log(SpaceFight.log, "Disposing game");
	}

	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
		Gdx.app.log(SpaceFight.log, "Setting screen: "
				+ screen.getClass().getSimpleName());
	}

}
