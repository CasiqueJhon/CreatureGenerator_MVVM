package com.raywenderlich.android.creaturemon.app

import android.app.Application
import android.arch.persistence.room.Room
import com.raywenderlich.android.creaturemon.model.room.CreatureDatabase

class CreaturemonApplication : Application() {

  companion object {
    lateinit var database: CreatureDatabase
  }

  override fun onCreate() {
    super.onCreate()
    database = Room.databaseBuilder(this,
            CreatureDatabase::class.java,
            "creature_table")
            .build()
  }
}