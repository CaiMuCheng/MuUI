package com.mucheng.muui

import android.os.Bundle
import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Component.Container.Column
import com.mucheng.ui.Component.Effects.TextButton
import com.mucheng.ui.Component.Scroll.FullSlider
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector
import com.mucheng.ui.Scope.ComposeScope
import com.mucheng.ui.TopLevel.compose

class MainActivity : ComposeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        compose()

    }

    override fun ComposeScope.onCompose() {
        Column {
            MainUI(Selector)
        }
    }

}

fun ComponentScope.MainUI(selector: Selector) {
    FullSlider {
        Column {
                TextButton("Text")
                TextButton("Text")
        }
    }
}