package com.scrooge.model.dto

import com.scrooge.model.enums.State

open class TraderStateDTO(open var states: MutableSet<State> = mutableSetOf()) {

	fun addState(state: State) {
		states.add(state)
	}

	fun removeState(state: State) {
		states.remove(state)
	}

	fun isPaused() = states.any { it == State.PauseManual || it == State.PauseSystem }

	fun isFreezed() =
			states.any {
				it == State.FreezeBaseGrowth ||
						it == State.FreezeManual ||
						it == State.FreezeSystem ||
						it == State.FreezeSocketDisconnection
			}

}