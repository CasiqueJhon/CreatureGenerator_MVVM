package com.raywenderlich.android.creaturemon.view.allcreatures

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.raywenderlich.android.creaturemon.R
import com.raywenderlich.android.creaturemon.app.inflate
import com.raywenderlich.android.creaturemon.model.Creature
import kotlinx.android.synthetic.main.list_item_creature.view.*

class CreatureAdapter(private val creatures: MutableList<Creature>)
  : RecyclerView.Adapter<CreatureAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(parent.inflate(R.layout.list_item_creature))
  }

  override fun onBindViewHolder(holder: CreatureAdapter.ViewHolder, position: Int) {
    holder.bind(creatures[position])
  }

  override fun getItemCount() = creatures.size

  fun updateCreatures(creatures: List<Creature>) {
    this.creatures.clear()
    this.creatures.addAll(creatures)
    notifyDataSetChanged()
  }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var creature: Creature

    fun bind(creature: Creature) {
      this.creature = creature
      itemView.avatarListItem.setImageDrawable(itemView.context.getDrawable(creature.drawable))
      itemView.name.text = creature.name
      itemView.hitPoints.text = creature.hitPoints.toString()
    }
  }
}