package com.raywenderlich.android.creaturemon.model

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CreatureGeneratorTest{
    private lateinit var generator: CreatureGenerator

    @Before
    fun setup() {
        generator = CreatureGenerator()
    }

    @Test
    fun testHitPoints() {
        val attributes = CreatureAttributes(
                intelligence = 7,
                strength = 3,
                endurance = 10
        )
        val name = "Pikachu"
        val creatureExpected = Creature(attributes, 84, name)

        assertEquals(creatureExpected, generator.creatureGenerated(attributes, name))
    }
}