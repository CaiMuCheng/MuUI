package com.mucheng.ui.Component.Effects

import com.google.android.material.button.MaterialButton
import com.mucheng.ui.Component.Container.Column
import com.mucheng.ui.Component.Text
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector

fun ComponentScope.Button(text: String, selector: Selector = Selector) {
    val button = MaterialButton(Activity).apply {
        setText(text)
        Container.addView(this)
    }


}

fun ComponentScope.TextButton(text: String, selector: Selector = Selector) {
    Column(

    ) {
        Text("Button")
    }
}