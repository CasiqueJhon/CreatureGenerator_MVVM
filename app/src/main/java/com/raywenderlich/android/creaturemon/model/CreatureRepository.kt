package com.raywenderlich.android.creaturemon.model

import android.arch.lifecycle.LiveData

interface CreatureRepository {
    fun savedCreatures(creature: Creature)

    fun getAllCreatures(): LiveData<List<Creature>>

    fun clearAllCreatures()
}