package com.mucheng.ui.Activity

import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.mucheng.ui.Scope.ComposeScope

@Suppress("LeakingThis")
abstract class ComposeActivity : AppCompatActivity() {

    private lateinit var composingScope: ComposeScope

    private lateinit var rootContainer: FrameLayout

    abstract fun ComposeScope.onCompose()

    internal fun requireComposingScope(): ComposeScope {
        if (!::composingScope.isInitialized) {
            composingScope = ComposeScope.create(this)
        }

        return composingScope
    }

    internal fun requireRootContainer(): FrameLayout {
        if (!::rootContainer.isInitialized) {
            rootContainer = FrameLayout(this)
        }

        return rootContainer
    }

}