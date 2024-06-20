package lc.wise.myfavouritepokemons

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
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
        with(binding){
            setPokemonInfo(eevee, eeveeImage,"Eevee", "Normal",
                R.color.normal, "0.3", "6.5", R.drawable.eevee)
            setPokemonInfo(vaporeon, vaporeonImage, "Vaporeon", "Water",
                R.color.water, "1", "29.0", R.drawable.vaporeon)
            setPokemonInfo(jolteon, jolteonImage, "Jolteon", "Electric",
                R.color.electric, "0.8", "24.5", R.drawable.jolteon)
            setPokemonInfo(flareon, flareonImage, "Flareon", "Fire",
                R.color.fire, "0.9", "25.0", R.drawable.flareon)
            setPokemonInfo(espeon, espeonImage, "Espeon", "Psychic",
                R.color.psychic, "0.9", "26.5", R.drawable.espeon)
            setPokemonInfo(umbreon, umbreonImage, "Umbreon", "Dark",
                R.color.dark, "1", "27.0", R.drawable.umbreon)
            setPokemonInfo(leafeon, leafeonImage, "Leafeon", "Grass",
                R.color.grass, "1", "25.5", R.drawable.leafeon)
            setPokemonInfo(glaceon, glaceonImage, "Glaceon", "Ice",
                R.color.ice, "0.8", "25.9", R.drawable.glaceon)
            setPokemonInfo(sylveon, sylveonImage, "Sylveon", "Fairy",
                R.color.fairy, "1", "23.5", R.drawable.sylveon)
        }
    }

    private fun setPokemonInfo(textView: TextView, imageView: ImageView, name: String,
                               type: String, @ColorRes typeColor: Int,
                               height: String, weight: String, @DrawableRes image: Int){
        textView.setOnClickListener {
            showPokemonInfo(name, type, typeColor, height, weight, image)
        }
        imageView.setOnClickListener {
            showPokemonInfo(name, type, typeColor, height, weight, image)
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