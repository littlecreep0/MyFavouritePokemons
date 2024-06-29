package lc.wise.myfavouritepokemons.ui

import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import lc.wise.myfavouritepokemons.R
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonAboutBinding

class PokemonAbout : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name: String = intent.extras?.getString("PokemonName") ?: "MissingNo"
        val type: String = intent.extras?.getString("PokemonType") ?: "???"
        @ColorRes val typeColor: Int = intent.extras?.getInt("PokemonTypeColor") ?: R.color.normal
        val height: String = intent.extras?.getString("PokemonHeight") ?: "???"
        val weight: String = intent.extras?.getString("PokemonWeight") ?: "???"
        @DrawableRes val image: Int = intent.extras?.getInt("PokemonImage") ?: R.drawable.missingno
        // im not willing to throw an exception
        // ill throw them another pokemon to catch instead

        with(binding) {
            pokemonName.text = "$name"
            pokemonType.text = "Type: $type"
            pokemonType.setTextColor(resources.getColor(typeColor))
            pokemonHeight.text = "Height: $height m"
            pokemonWeight.text = "Weight: $weight kg"
            pokemonImage.setImageResource(image)
            back.setOnClickListener {
                finish()
            }
        }
    }
}