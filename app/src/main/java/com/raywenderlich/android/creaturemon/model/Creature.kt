package com.raywenderlich.android.creaturemon.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

@Entity(tableName = "creature_table")
data class Creature(
        val attributes: CreatureAttributes = CreatureAttributes(),
        val hitPoints: Int = 0,
        @PrimaryKey @NonNull val name: String,
        val drawable: Int = 0
)