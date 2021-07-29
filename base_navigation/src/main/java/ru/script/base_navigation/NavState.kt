package ru.script.base_navigation

class NavState {
    companion object {
        private var oldDest: NavDest = NavDest.BASE
        private var targetDest: NavDest = NavDest.BASE

        fun setNavigations(old: NavDest, target: NavDest) {
            if (target!=NavDest.OLD) {
                oldDest = old
            }
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