package ru.script.base_navigation

import android.content.Context
import ru.script.base_navigation.NavigationState.Companion.putNavState
import java.util.*

class NavState {
    companion object {
        private var oldDest: NavDest = NavDest.BASE
        private var targetDest: NavDest = NavDest.BASE
        private var backstackGlobal: Stack<NavDest> = Stack()

        fun setNavigationOld(ctx: Context, old: NavDest) {
                oldDest = old
            putNavState(backstackGlobal,ctx)
        }

        fun setNavigationTarget(target: NavDest){
            targetDest = target
        }

        fun getOldDest(): NavDest{
            return oldDest
        }

        fun getTargetDest(): NavDest{
            return targetDest
        }

    }
}