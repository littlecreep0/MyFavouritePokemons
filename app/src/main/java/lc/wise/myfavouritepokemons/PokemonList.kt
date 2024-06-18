package lc.wise.myfavouritepokemons

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonListBinding

class PokemonList : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val eevee = binding.eevee
        eevee.setOnClickListener {
            showPokemonInfo("Eevee", "Normal", "0.3", "6.5")
        }
        val eeveeIcon = binding.eeveeIcon
        eeveeIcon.setOnClickListener {
            showPokemonInfo("Eevee", "Normal", "0.3", "6.5")
        }

        val vaporeon = binding.vaporeon
        vaporeon.setOnClickListener {
            showPokemonInfo("Vaporeon", "Water", "1", "29.0")
        }
        val vaporeonIcon = binding.vaporeonIcon
        vaporeonIcon.setOnClickListener {
            showPokemonInfo("Vaporeon", "Water", "1", "29.0")
        }

        val jolteon = binding.jolteon
        jolteon.setOnClickListener {
            showPokemonInfo("Jolteon", "Electric", "0.8", "24.5")
        }
        val jolteonIcon = binding.jolteonIcon
        jolteonIcon.setOnClickListener {
            showPokemonInfo("Jolteon", "Electric", "0.8", "24.5")
        }

        val flareon = binding.flareon
        flareon.setOnClickListener {
            showPokemonInfo("Flareon", "Fire", "0.9", "25.0")
        }
        val flareonIcon = binding.flareonIcon
        flareonIcon.setOnClickListener {
            showPokemonInfo("Flareon", "Fire", "0.9", "25.0")
        }

        val espeon = binding.espeon
        espeon.setOnClickListener {
            showPokemonInfo("Espeon", "Psychic", "0.9", "26.5")
        }
        val espeonIcon = binding.espeonIcon
        espeonIcon.setOnClickListener {
            showPokemonInfo("Espeon", "Psychic", "0.9", "26.5")
        }

        val umbreon = binding.umbreon
        umbreon.setOnClickListener {
            showPokemonInfo("Umbreon", "Dark", "1", "27.0")
        }
        val umbreonIcon = binding.umbreonIcon
        umbreonIcon.setOnClickListener {
            showPokemonInfo("Umbreon", "Dark", "1", "27.0")
        }

        val leafeon = binding.leafeon
        leafeon.setOnClickListener {
            showPokemonInfo("Leafeon", "Grass", "1", "25.5")
        }
        val leafeonIcon = binding.leafeonIcon
        leafeonIcon.setOnClickListener {
            showPokemonInfo("Leafeon", "Grass", "1", "25.5")
        }

        val glaceon = binding.glaceon
        glaceon.setOnClickListener {
            showPokemonInfo("Glaceon", "Ice", "0.8", "25.9")
        }
        val glaceonIcon = binding.glaceonIcon
        glaceonIcon.setOnClickListener {
            showPokemonInfo("Glaceon", "Ice", "0.8", "25.9")
        }

        val sylveon = binding.sylveon
        sylveon.setOnClickListener {
            showPokemonInfo("Sylveon", "Fairy", "1", "23.5")
        }
        val sylveonIcon = binding.sylveonIcon
        sylveonIcon.setOnClickListener {
            showPokemonInfo("Sylveon", "Fairy", "1", "23.5")
        }
    }
    private fun showPokemonInfo(name: String, type: String, height: String, weight: String){
        val showPokemonInfo = Intent(this, PokemonAbout::class.java).apply {
            putExtra("PokemonName", name)
            putExtra("PokemonType", type)
            putExtra("PokemonHeight", height)
            putExtra("PokemonWeight", weight)
        }
        startActivity(showPokemonInfo)
    }
}