package lc.wise.myfavouritepokemons

import android.content.Intent
import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonListBinding

class PokemonList : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textViewInit()
        imageViewInit()
    }

    private fun textViewInit(){
        with(binding){
            eevee.setOnClickListener {
                showPokemonInfo("Eevee", "Normal", R.color.normal,
                    "0.3", "6.5", R.drawable.eevee)
            }
            vaporeon.setOnClickListener {
                showPokemonInfo("Vaporeon", "Water", R.color.water,
                    "1", "29.0", R.drawable.vaporeon)
            }
            jolteon.setOnClickListener {
                showPokemonInfo("Jolteon", "Electric", R.color.electric,
                    "0.8", "24.5", R.drawable.jolteon)
            }
            flareon.setOnClickListener {
                showPokemonInfo("Flareon", "Fire", R.color.fire,
                    "0.9", "25.0", R.drawable.flareon)
            }
            espeon.setOnClickListener {
                showPokemonInfo("Espeon", "Psychic", R.color.psychic,
                    "0.9", "26.5", R.drawable.espeon)
            }
            umbreon.setOnClickListener {
                showPokemonInfo("Umbreon", "Dark", R.color.dark,
                    "1", "27.0", R.drawable.umbreon)
            }
            leafeon.setOnClickListener {
                showPokemonInfo("Leafeon", "Grass", R.color.grass,
                    "1", "25.5", R.drawable.leafeon)
            }
            glaceon.setOnClickListener {
                showPokemonInfo("Glaceon", "Ice", R.color.ice,
                    "0.8", "25.9", R.drawable.glaceon)
            }
            sylveon.setOnClickListener {
                showPokemonInfo("Sylveon", "Fairy", R.color.fairy,
                    "1", "23.5", R.drawable.sylveon)
            }
        }
    }

    private fun imageViewInit(){
        with(binding){
            eeveeImage.setOnClickListener {
                showPokemonInfo("Eevee", "Normal", R.color.normal,
                    "0.3", "6.5", R.drawable.eevee)
            }
            vaporeonImage.setOnClickListener {
                showPokemonInfo("Vaporeon", "Water", R.color.water,
                    "1", "29.0", R.drawable.vaporeon)
            }
            jolteonImage.setOnClickListener {
                showPokemonInfo("Jolteon", "Electric", R.color.electric,
                    "0.8", "24.5", R.drawable.jolteon)
            }
            flareonImage.setOnClickListener {
                showPokemonInfo("Flareon", "Fire", R.color.fire,
                    "0.9", "25.0", R.drawable.flareon)
            }
            espeonImage.setOnClickListener {
                showPokemonInfo("Espeon", "Psychic", R.color.psychic,
                    "0.9", "26.5", R.drawable.espeon)
            }
            umbreonImage.setOnClickListener {
                showPokemonInfo("Umbreon", "Dark", R.color.dark,
                    "1", "27.0", R.drawable.umbreon)
            }
            leafeonImage.setOnClickListener {
                showPokemonInfo("Leafeon", "Grass", R.color.grass,
                    "1", "25.5", R.drawable.leafeon)
            }
            glaceonImage.setOnClickListener {
                showPokemonInfo("Glaceon", "Ice", R.color.ice,
                    "0.8", "25.9", R.drawable.glaceon)
            }
            sylveonImage.setOnClickListener {
                showPokemonInfo("Sylveon", "Fairy", R.color.fairy,
                    "1", "23.5", R.drawable.sylveon)
            }
        }
    }

    private fun showPokemonInfo(name: String, type: String, @ColorRes typeColor: Int,
                                height: String, weight: String, @DrawableRes image: Int){
        val showPokemonInfo = Intent(this, PokemonAbout::class.java).apply {
            putExtra("PokemonName", name)
            putExtra("PokemonType", type)
            putExtra("PokemonTypeColor", typeColor)
            putExtra("PokemonHeight", height)
            putExtra("PokemonWeight", weight)
            putExtra("PokemonImage", image)
        }
        startActivity(showPokemonInfo)
    }
}