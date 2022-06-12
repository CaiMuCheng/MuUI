package com.mucheng.ui.Component.Scroll

import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.core.widget.NestedScrollView
import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Compose.ComponentScope
import com.mucheng.ui.Core.Selector

enum class ScrollMode {

    HORIZONTAL, VERTICAL

}

class BaseSliderScope(activity: ComposeActivity, viewGroup: ViewGroup) :
    ComponentScope(activity, viewGroup)

inline fun ComponentScope.Slider(
    selector: Selector = com.mucheng.ui.Core.Selector,
    block: BaseSliderScope.() -> Unit,
) {
    val scrollTarget = selector["scrollable"] ?: ScrollMode.VERTICAL
    var outSlider: ViewGroup? = null

    when (scrollTarget) {
        ScrollMode.HORIZONTAL -> {
            outSlider = HorizontalScrollView(Activity).apply {
                Container.addView(this)
            }
        }

        ScrollMode.VERTICAL -> {
            outSlider = NestedScrollView(Activity).apply {
                Container.addView(this)
            }
        }
    }

    selector.clear()

    val scope = BaseSliderScope(Activity, outSlider!!)
    scope.block()
}

inline fun ComponentScope.FullSlider(selector: Selector = com.mucheng.ui.Core.Selector, block: BaseSliderScope.() -> Unit) {
    Slider(selector.scrollable(ScrollMode.VERTICAL)) {
        Slider(selector.scrollable(ScrollMode.HORIZONTAL), block)
    }
}

fun Selector.scrollable(
    target: ScrollMode,
): Selector {
    put("scrollable", target)
    return this
}