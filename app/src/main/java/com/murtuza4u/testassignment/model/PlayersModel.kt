package com.murtuza4u.testassignment.model

class PlayersModel(
    private var player_name: String,
    private var player_image: Int
) {

    // Getter and Setter
    fun getCourse_name(): String {
        return player_name
    }

    fun setCourse_name(player_name: String) {
        this.player_name = player_name
    }


    fun getCourse_image(): Int {
        return player_image
    }

    fun setCourse_image(player_image: Int) {
        this.player_image = player_image
    }
}
