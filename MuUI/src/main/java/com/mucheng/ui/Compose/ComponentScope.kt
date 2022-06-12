package com.mucheng.ui.Compose

import android.view.ViewGroup
import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Scope.CoreScope

abstract class ComponentScope(private val activity: ComposeActivity, viewGroup: ViewGroup) :
    CoreScope(activity, viewGroup) {

    val Container: ViewGroup = viewGroup

    val Activity: ComposeActivity by lazy { activity }

}