package com.raywenderlich.android.creaturemon.model

object AttributeStore {
  val INTELLIGENCE: List<AttributeValue> by lazy {
    val avatars = mutableListOf<AttributeValue>()
    avatars.add(AttributeValue("None"))
    avatars.add(AttributeValue("Aristotle", 3))
    avatars.add(AttributeValue("Newton", 7))
    avatars.add(AttributeValue("Einstein", 10))
    avatars
  }
  val STRENGTH: List<AttributeValue> by lazy {
    val avatars = mutableListOf<AttributeValue>()
    avatars.add(AttributeValue("None"))
    avatars.add(AttributeValue("Thor", 3))
    avatars.add(AttributeValue("Hulk", 7))
    avatars.add(AttributeValue("Hercules", 10))
    avatars
  }
  val ENDURANCE: List<AttributeValue> by lazy {
    val avatars = mutableListOf<AttributeValue>()
    avatars.add(AttributeValue("None"))
    avatars.add(AttributeValue("Aluminum", 3))
    avatars.add(AttributeValue("Gold", 7))
    avatars.add(AttributeValue("Iron", 10))
    avatars
  }
}