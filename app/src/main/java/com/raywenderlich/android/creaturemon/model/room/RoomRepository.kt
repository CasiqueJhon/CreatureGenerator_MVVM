package com.raywenderlich.android.creaturemon.model.room

import android.arch.lifecycle.LiveData
import android.os.AsyncTask
import com.raywenderlich.android.creaturemon.app.CreaturemonApplication
import com.raywenderlich.android.creaturemon.model.Creature
import com.raywenderlich.android.creaturemon.model.CreatureRepository

class RoomRepository : CreatureRepository {

  private val creatureDao: CreatureDao = CreaturemonApplication.database.creatureDao()

  private val allCreatures: LiveData<List<Creature>>

  init {
      allCreatures = creatureDao.getAllCreatures()
  }

  override fun savedCreatures(creature: Creature) {
    InsertAsyncTask(creatureDao).execute(creature)
  }

  override fun getAllCreatures(): LiveData<List<Creature>> {
    return allCreatures
  }

  override fun clearAllCreatures() {
    val arrayOf = allCreatures.value?.toTypedArray()
    if (arrayOf != null){
      DeleteAsyncTask(creatureDao).execute(*arrayOf)
    }
  }

  private class InsertAsyncTask internal constructor(private val dao: CreatureDao) : AsyncTask<Creature, Void, Void>() {
    override fun doInBackground(vararg params: Creature): Void? {
      dao.insert(params[0])
      return null
    }
  }

  private class DeleteAsyncTask internal constructor(private val dao: CreatureDao) : AsyncTask<Creature, Void, Void>() {
    override fun doInBackground(vararg params: Creature): Void? {
      dao.clearAllCreatures(*params)
      return null
    }
  }
}