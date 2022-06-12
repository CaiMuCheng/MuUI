package com.mucheng.ui.Component

import android.widget.TextView
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector

fun ComponentScope.Text(text: String, selector: Selector = Selector) {
    val textView = TextView(Activity)

    textView.text = text
    selector["textSize"]?.let { textView.textSize = it as Float }


    Container.addView(textView)

    selector.clear()
}

fun Selector.textSize(size: Number): Selector {
    put("textSize", size.toFloat())
    return this
}