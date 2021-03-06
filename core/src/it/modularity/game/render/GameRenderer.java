package it.modularity.game.render;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import it.modularity.game.entities.Entity;
import it.modularity.game.world.GameController;

public class GameRenderer implements BaseRenderer<GameController> {

    private SpriteBatch spriteBatch;

    @Override
    public void init() {
        this.spriteBatch = new SpriteBatch();
    }

    @Override
    public void render(GameController source) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        this.spriteBatch.begin();

        for (Entity entity : source.entityList)
            entity.draw(this.spriteBatch);

        this.spriteBatch.end();

    }
}
