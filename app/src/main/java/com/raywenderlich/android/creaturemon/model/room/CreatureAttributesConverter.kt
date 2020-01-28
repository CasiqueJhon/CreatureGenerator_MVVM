package com.raywenderlich.android.creaturemon.model.room

import android.arch.persistence.room.TypeConverter
import com.raywenderlich.android.creaturemon.model.CreatureAttributes
import java.util.*

class CreatureAttributesConverter {
  @TypeConverter
  fun fromCreatureAttributes(attributes: CreatureAttributes?): String? {
    if (attributes != null) {
      return String.format(Locale.US, "%d,%d,%d", attributes.intelligence, attributes.strength, attributes.endurance)
    }
    return null
  }

  @TypeConverter
  fun toCreatureAttributes(value: String?): CreatureAttributes? {
    if (value != null) {
      val pieces = value.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
      return CreatureAttributes(
          Integer.parseInt(pieces[0]),
          Integer.parseInt(pieces[1]),
          Integer.parseInt(pieces[2]))
    }
    return null
  }
}