package lc.wise.myfavouritepokemons.pokemonRepo

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes

data class Pokemon(
    val id: Int,
    val name: String,
    val type: String,
    @ColorRes val typeColor: Int,
    val height: String,
    val weight: String,
    @DrawableRes val image: Int
)
