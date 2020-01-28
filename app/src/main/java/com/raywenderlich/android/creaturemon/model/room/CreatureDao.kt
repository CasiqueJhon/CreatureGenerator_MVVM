package com.raywenderlich.android.creaturemon.model.room

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.raywenderlich.android.creaturemon.model.Creature

@Dao
interface CreatureDao {

    @Insert
    fun insert(creature: Creature)

    @Delete
    fun clearAllCreatures(vararg creature: Creature)

    @Query("SELECT * FROM creature_table ORDER BY name ASC")
    fun getAllCreatures(): LiveData<List<Creature>>
}