package lc.wise.myfavouritepokemons

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonAboutBinding

class PokemonAbout : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pokemonName: TextView = binding.pokemonName
        val pokemonType: TextView = binding.pokemonType
        val pokemonHeight: TextView = binding.pokemonHeight
        val pokemonWeight: TextView = binding.pokemonWeight
        val pokemonPicture: ImageView = binding.pokemonPicture

        val name: String = intent.extras?.getString("PokemonName") ?: "MissingNo"
        val type: String = intent.extras?.getString("PokemonType") ?: "???"
        val height: String = intent.extras?.getString("PokemonHeight") ?: "???"
        val weight: String = intent.extras?.getString("PokemonWeight") ?: "???"
        // im not willing to throw an exception
        // ill throw them another pokemon to catch instead

        pokemonName.text = "$name"
        pokemonType.text = "Type: $type"
        pokemonHeight.text = "Height: $height m"
        pokemonWeight.text = "Weight: $weight kg"

        when(name){
            "Eevee" -> {
                pokemonPicture.setImageResource(R.drawable.eevee)
                pokemonType.setTextColor(resources.getColor(R.color.normal))
            }
            "Vaporeon" -> {
                pokemonPicture.setImageResource(R.drawable.vaporeon)
                pokemonType.setTextColor(resources.getColor(R.color.water))
            }
            "Jolteon" -> {
                pokemonPicture.setImageResource(R.drawable.jolteon)
                pokemonType.setTextColor(resources.getColor(R.color.electric))
            }
            "Flareon" -> {
                pokemonPicture.setImageResource(R.drawable.flareon)
                pokemonType.setTextColor(resources.getColor(R.color.fire))
            }
            "Espeon" -> {
                pokemonPicture.setImageResource(R.drawable.espeon)
                pokemonType.setTextColor(resources.getColor(R.color.psychic))
            }
            "Umbreon" -> {
                pokemonPicture.setImageResource(R.drawable.umbreon)
                pokemonType.setTextColor(resources.getColor(R.color.dark))
            }
            "Leafeon" -> {
                pokemonPicture.setImageResource(R.drawable.leafeon)
                pokemonType.setTextColor(resources.getColor(R.color.grass))
            }
            "Glaceon" -> {
                pokemonPicture.setImageResource(R.drawable.glaceon)
                pokemonType.setTextColor(resources.getColor(R.color.ice))
            }
            "Sylveon" -> {
                pokemonPicture.setImageResource(R.drawable.sylveon)
                pokemonType.setTextColor(resources.getColor(R.color.fairy))
            }
            else -> {
                Toast.makeText(this@PokemonAbout, "A wild MISSINGNO appeared!",
                    Toast.LENGTH_SHORT).show()
                pokemonPicture.setImageResource(R.drawable.missingno)
            }
        }

        val back: Button = binding.back
        back.setOnClickListener {
            finish()
        }
    }
}