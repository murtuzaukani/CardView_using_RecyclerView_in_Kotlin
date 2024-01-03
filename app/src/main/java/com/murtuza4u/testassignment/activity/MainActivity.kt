package com.murtuza4u.testassignment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.murtuza4u.testassignment.R
import com.murtuza4u.testassignment.adapter.PlayersAdapter
import com.murtuza4u.testassignment.model.PlayersModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courseRV = findViewById<RecyclerView>(R.id.idRVCourse)

        // Here, we have created new array list and added data to it
        val playersModelArrayLists: ArrayList<PlayersModel> = ArrayList<PlayersModel>()
        playersModelArrayLists.add(PlayersModel("Virat Kohli", R.drawable.virat))
        playersModelArrayLists.add(PlayersModel("Rohit Sharma", R.drawable.rohit))
        playersModelArrayLists.add(PlayersModel("Pat Cummins", R.drawable.cummins))
        playersModelArrayLists.add(PlayersModel("Mitchell Starc", R.drawable.starc))
        playersModelArrayLists.add(PlayersModel("KL Rahul", R.drawable.kl))
        playersModelArrayLists.add(PlayersModel("Glenn Maxwell", R.drawable.maxwell))
        playersModelArrayLists.add(PlayersModel("Rashid Khan", R.drawable.rashid))

        // we are initializing our adapter class and passing our arraylist to it.
        val playersAdapter = PlayersAdapter(this, playersModelArrayLists)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.layoutManager = linearLayoutManager
        courseRV.adapter = playersAdapter
    }
}
