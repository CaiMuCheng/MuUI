package com.mucheng.ui.Component.Container

import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector

class ColumnScope(activity: ComposeActivity, viewGroup: ViewGroup) : ComponentScope(activity,
    viewGroup)

inline fun ComponentScope.Column(selector: Selector = Selector, block: ColumnScope.() -> Unit) {
    val column = LinearLayoutCompat(Activity).apply {
        orientation = LinearLayoutCompat.VERTICAL
        Container.addView(this)
    }

    selector.clear()

    val scope = ColumnScope(Activity, column)
    scope.block()
}