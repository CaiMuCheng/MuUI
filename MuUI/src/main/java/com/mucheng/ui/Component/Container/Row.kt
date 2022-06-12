package com.mucheng.ui.Component.Container

import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector

class RowScope(activity: ComposeActivity, viewGroup: ViewGroup) : ComponentScope(activity,
    viewGroup)

inline fun ComponentScope.Row(selector: Selector = Selector, block: RowScope.() -> Unit) {
    val row = LinearLayoutCompat(Activity).apply {
        orientation = LinearLayoutCompat.HORIZONTAL
        Container.addView(this)
    }

    selector.clear()

    val scope = RowScope(Activity, row)
    scope.block()
}