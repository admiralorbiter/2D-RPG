package com.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Player player;

	@Override
	public void create () {
		batch = new SpriteBatch();
		Texture texture = new Texture("dalle3.png");
		player = new Player(texture);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		player.update();
		batch.begin();
		player.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
