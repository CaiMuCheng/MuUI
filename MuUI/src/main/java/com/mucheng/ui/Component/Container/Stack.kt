package com.mucheng.ui.Component.Container

import android.view.ViewGroup
import android.widget.FrameLayout
import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector

class StackScope(activity: ComposeActivity, viewGroup: ViewGroup) :
    ComponentScope(activity, viewGroup) {

}

inline fun ComponentScope.Stack(selector: Selector = Selector, block: StackScope.() -> Unit) {
    val stack = FrameLayout(Activity).apply {
        Container.addView(this)
    }

    selector.clear()

    val scope = StackScope(Activity, stack)
    scope.block()
}