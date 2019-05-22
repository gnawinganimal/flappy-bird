package com.jamdan2.flappybird.components

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.graphics.g2d.Sprite

data class VisualComponent(
        val sprite: Sprite?,
        val center: Boolean
) : Component

data class PositionComponent(
        var x: Float,
        var y: Float,
        val z: Float,
        val width: Float,
        val height: Float,
        var angle: Float
) : Component

data class DeltaComponent(
        var dx: Float,
        var dy: Float
) : Component

data class ControlComponent(
        var jump: Boolean
) : Component
