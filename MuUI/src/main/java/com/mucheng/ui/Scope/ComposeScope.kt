package com.mucheng.ui.Scope

import com.mucheng.ui.Activity.ComposeActivity
import com.mucheng.ui.Compose.ComponentScope

class ComposeScope private constructor(activity: ComposeActivity) :
    ComponentScope(activity, activity.requireRootContainer()) {

    init {
        activity.setContentView(Container)
    }

    companion object {
        fun create(activity: ComposeActivity): ComposeScope {
            return ComposeScope(activity)
        }
    }

}