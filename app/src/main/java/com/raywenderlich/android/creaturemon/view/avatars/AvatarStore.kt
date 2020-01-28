package com.raywenderlich.android.creaturemon.view.avatars

import com.raywenderlich.android.creaturemon.R
import com.raywenderlich.android.creaturemon.model.Avatar

object AvatarStore {
  val AVATARS: List<Avatar> by lazy {
    val avatars = mutableListOf<Avatar>()

    avatars.add(Avatar(R.drawable.creature_app_whistle_1))
    avatars.add(Avatar(R.drawable.creature_bear_sleepy))
    avatars.add(Avatar(R.drawable.creature_bird_blue_fly_1))
    avatars.add(Avatar(R.drawable.creature_bug_insect_happy))
    avatars.add(Avatar(R.drawable.creature_bug_spider))
    avatars.add(Avatar(R.drawable.creature_cat_derp))
    avatars.add(Avatar(R.drawable.creature_cow_01))
    avatars.add(Avatar(R.drawable.creature_dino_01))
    avatars.add(Avatar(R.drawable.creature_dog_bone))
    avatars.add(Avatar(R.drawable.creature_duck_yellow_1))
    avatars.add(Avatar(R.drawable.creature_frog_hungry))
    avatars.add(Avatar(R.drawable.creature_head_fox))
    avatars.add(Avatar(R.drawable.creature_head_pig))
    avatars.add(Avatar(R.drawable.creature_head_tiger))
    avatars.add(Avatar(R.drawable.creature_monkey_happy))
    avatars.add(Avatar(R.drawable.creature_monster_purple))
    avatars.add(Avatar(R.drawable.creature_monster_slug))
    avatars.add(Avatar(R.drawable.creature_monster_yeti_1))
    avatars.add(Avatar(R.drawable.creature_owl_attack_1))
    avatars.add(Avatar(R.drawable.creature_panda_fun))
    avatars.add(Avatar(R.drawable.creature_penguin_plane))
    avatars.add(Avatar(R.drawable.creature_rat))
    avatars.add(Avatar(R.drawable.creature_skunk))
    avatars.add(Avatar(R.drawable.creature_square_bunny))
    avatars.add(Avatar(R.drawable.creature_wolf_crazy))

    avatars
  }
}