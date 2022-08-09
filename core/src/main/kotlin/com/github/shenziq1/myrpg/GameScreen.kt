package com.github.shenziq1.myrpg

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.Scaling
import com.badlogic.gdx.utils.viewport.ExtendViewport
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import ktx.graphics.use
import ktx.log.logger
import ktx.scene2d.actors
import ktx.scene2d.image

class GameScreen : KtxScreen {
    private val stage = Stage(ExtendViewport(16f, 9f))
    private val texture = Texture("characters/player.png")

    companion object{
        val log = logger<GameScreen>()
    }

    override fun show() {
        log.debug { "game screen has shown" }
        stage.actors {
            image(texture).apply {
                setPosition(1f, 1f)
                setSize(1f, 1f)
                setScaling(Scaling.fill)
            }
        }
        super.show()

    }

    override fun resize(width: Int, height: Int) {
        log.debug { "viewport has been changed to $width x $height"  }
        stage.viewport.update(width, height, true)
    }

    
    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        with(stage){
            act(delta)
            draw()
        }


    }

    override fun dispose() {

    }
}