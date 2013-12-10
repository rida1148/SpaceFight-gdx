package net.justinwhite.spacefight;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "space-fight";
		cfg.useGL20 = true;
		cfg.width = 1280;
		cfg.height = 720;
		// pause when window is in the background
		cfg.backgroundFPS = -1;
		cfg.foregroundFPS = 60;
		
		new LwjglApplication(new SpaceFight(), cfg);
	}
}
