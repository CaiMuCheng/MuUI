package com.mucheng.ui.TopLevel

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.mucheng.ui.Activity.ComposeActivity

fun ComposeActivity.compose() {
    val scope = requireComposingScope()
    val lifecycle = lifecycle
    scope.Selector.clear()

    lifecycle.addObserver(object : DefaultLifecycleObserver {

        override fun onCreate(owner: LifecycleOwner) {
            super.onCreate(owner)
            scope.onCompose()
        }

    })
}