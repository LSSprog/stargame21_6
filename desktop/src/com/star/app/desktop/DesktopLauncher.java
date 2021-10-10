package com.star.app.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.star.app.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new StarGame(), config);
	}

//	1. Разобраться с кодом.
//  2. Сделать так, чтобы при приближении к power-ups они начинали летать в сторону игрока.
//  3* При уничтожении.всех астероидов уровень игры повышается, появляются новые астероиды, у которых больше жизни и они наносят больше урона при столкновении.
}
