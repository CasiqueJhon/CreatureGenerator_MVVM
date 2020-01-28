package com.raywenderlich.android.creaturemon.view.avatars

import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.widget.GridLayoutManager
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.raywenderlich.android.creaturemon.R
import com.raywenderlich.android.creaturemon.model.Avatar
import kotlinx.android.synthetic.main.layout_avatar_bottom_sheet.*
import kotlin.ClassCastException as ClassCastException1


class AvatarBottomDialogFragment : BottomSheetDialogFragment(), AvatarAdapter.AvatarListener {

  private lateinit var callback: AvatarAdapter.AvatarListener

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.layout_avatar_bottom_sheet, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    avatarRecyclerView.layoutManager = GridLayoutManager(context, 3)
    avatarRecyclerView.adapter = AvatarAdapter(AvatarStore.AVATARS, this)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    try {
      callback = activity as AvatarAdapter.AvatarListener
    } catch (e: ClassCastException) {
      throw ClassCastException(activity.toString() + " must implement AvatarAdapter.AvatarListener")
    }
  }

  override fun avatarClicked(avatar: Avatar) {
    callback.avatarClicked(avatar)
  }

  companion object {
    fun newInstance(): AvatarBottomDialogFragment {
      return AvatarBottomDialogFragment()
    }
  }
}