package com.murtuza4u.testassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murtuza4u.testassignment.R
import com.murtuza4u.testassignment.model.PlayersModel


class PlayersAdapter(private val context: Context, playersModelArrayList: ArrayList<PlayersModel>) :
    RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {
    private val playersModelArrayList: ArrayList<PlayersModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersAdapter.ViewHolder {
        // to inflate the layout for each item of recycler view.
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.cards_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayersAdapter.ViewHolder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: PlayersModel = playersModelArrayList[position]
        holder.player_name.setText(model.getCourse_name())
        holder.player_image.setImageResource(model.getCourse_image())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return playersModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        public val player_image: ImageView
        public val player_name: TextView

        init {
            player_image = itemView.findViewById(R.id.idIVCourseImage)
            player_name = itemView.findViewById(R.id.idTVCourseName)
        }
    }

    // Constructor
    init {
        this.playersModelArrayList = playersModelArrayList
    }
}
