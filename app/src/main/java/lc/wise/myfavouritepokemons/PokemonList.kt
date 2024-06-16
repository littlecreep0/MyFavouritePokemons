package lc.wise.myfavouritepokemons

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonListBinding

class PokemonList : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonListBinding
    private lateinit var bundle: Bundle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bundle = Bundle()
        val eevee = binding.eevee
        eevee.setOnClickListener {
            bundle.putString("PokemonName", "Eevee")
            bundle.putString("PokemonType", "Normal")
            bundle.putString("PokemonHeight", "0.3")
            bundle.putString("PokemonWeight", "6.5")
            showPokemonInfo()
        }
        val vaporeon = binding.vaporeon
        vaporeon.setOnClickListener {
            bundle.putString("PokemonName", "Vaporeon")
            bundle.putString("PokemonType", "Water")
            bundle.putString("PokemonHeight", "1")
            bundle.putString("PokemonWeight", "29")
            showPokemonInfo()
        }
        val jolteon = binding.jolteon
        jolteon.setOnClickListener {
            bundle.putString("PokemonName", "Jolteon")
            bundle.putString("PokemonType", "Electric")
            bundle.putString("PokemonHeight", "0.8")
            bundle.putString("PokemonWeight", "24.5")
            showPokemonInfo()
        }
        val flareon = binding.flareon
        flareon.setOnClickListener {
            bundle.putString("PokemonName", "Flareon")
            bundle.putString("PokemonType", "Fire")
            bundle.putString("PokemonHeight", "0.9")
            bundle.putString("PokemonWeight", "25")
            showPokemonInfo()
        }
        val espeon = binding.espeon
        espeon.setOnClickListener {
            bundle.putString("PokemonName", "Espeon")
            bundle.putString("PokemonType", "Psychic")
            bundle.putString("PokemonHeight", "0.9")
            bundle.putString("PokemonWeight", "26.5")
            showPokemonInfo()
        }
        val umbreon = binding.umbreon
        umbreon.setOnClickListener {
            bundle.putString("PokemonName", "Umbreon")
            bundle.putString("PokemonType", "Dark")
            bundle.putString("PokemonHeight", "1")
            bundle.putString("PokemonWeight", "27")
            showPokemonInfo()
        }
        val leafeon = binding.leafeon
        leafeon.setOnClickListener {
            bundle.putString("PokemonName", "Leafeon")
            bundle.putString("PokemonType", "Grass")
            bundle.putString("PokemonHeight", "1")
            bundle.putString("PokemonWeight", "25.5")
            showPokemonInfo()
        }
        val glaceon = binding.glaceon
        glaceon.setOnClickListener {
            bundle.putString("PokemonName", "Glaceon")
            bundle.putString("PokemonType", "Ice")
            bundle.putString("PokemonHeight", "0.8")
            bundle.putString("PokemonWeight", "25.9")
            showPokemonInfo()
        }
        val sylveon = binding.sylveon
        sylveon.setOnClickListener {
            bundle.putString("PokemonName", "Sylveon")
            bundle.putString("PokemonType", "Fairy")
            bundle.putString("PokemonHeight", "1")
            bundle.putString("PokemonWeight", "23.5")
            showPokemonInfo()
        }
    }
    private fun showPokemonInfo(){
        val showPokemonInfo = Intent(this, PokemonAbout::class.java)
        showPokemonInfo.putExtras(bundle)
        startActivity(showPokemonInfo)
    }
}