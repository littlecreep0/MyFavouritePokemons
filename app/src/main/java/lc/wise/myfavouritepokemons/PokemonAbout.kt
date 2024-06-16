package lc.wise.myfavouritepokemons

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonAboutBinding

class PokemonAbout : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        val name:String? = bundle!!.getString("PokemonName", "pokemon")
        val type:String? = bundle.getString("PokemonType", "type")
        val height:String? = bundle.getString("PokemonHeight", "height")
        val weight:String? = bundle.getString("PokemonWeight", "weight")
        val pokemonName: TextView = binding.pokemonName
        val pokemonType: TextView = binding.pokemonType
        val pokemonHeight: TextView = binding.pokemonHeight
        val pokemonWeight: TextView = binding.pokemonWeight
        pokemonName.text = name
        pokemonType.text = "Type: " + type
        pokemonHeight.text = "Height: " + height + " m"
        pokemonWeight.text = "Weight: " + weight + " kg"
        val pokemonPicture: ImageView = binding.pokemonPicture
        when(name){
            "Eevee" -> {
                pokemonPicture.setImageResource(R.drawable.eevee)
            }
            "Vaporeon" -> {
                pokemonPicture.setImageResource(R.drawable.vaporeon)
            }
            "Jolteon" -> {
                pokemonPicture.setImageResource(R.drawable.jolteon)
            }
            "Flareon" -> {
                pokemonPicture.setImageResource(R.drawable.flareon)
            }
            "Espeon" -> {
                pokemonPicture.setImageResource(R.drawable.espeon)
            }
            "Umbreon" -> {
                pokemonPicture.setImageResource(R.drawable.umbreon)
            }
            "Leafeon" -> {
                pokemonPicture.setImageResource(R.drawable.leafeon)
            }
            "Glaceon" -> {
                pokemonPicture.setImageResource(R.drawable.glaceon)
            }
            "Sylveon" -> {
                pokemonPicture.setImageResource(R.drawable.sylveon)
            }
        }
        val back: Button = binding.back
        back.setOnClickListener {
            finish()
        }
    }
}