package lc.wise.myfavouritepokemons.ui

import android.content.Intent
import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import lc.wise.myfavouritepokemons.R
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonListBinding
import lc.wise.myfavouritepokemons.pokemonRepo.PokemonRepo
import lc.wise.myfavouritepokemons.recyclerViewSetup.CustomDivider
import lc.wise.myfavouritepokemons.recyclerViewSetup.DiffUtilCallback
import lc.wise.myfavouritepokemons.recyclerViewSetup.PokemonListAdapter

class PokemonList : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokemonList = PokemonRepo.getPokemonList().values.toList()

        val adapter = PokemonListAdapter()
        binding.pokemonList.adapter = adapter
        adapter.showPokemonList(pokemonList)
        adapter.onClick = { pokemon ->
            with(pokemon){
                showPokemonInfo(name,
                                type,
                                typeColor,
                                height,
                                weight,
                                image)
            }
        }
        binding.pokemonList.addItemDecoration(
            CustomDivider(resources.getDrawable(R.drawable.item_divider)!!)
        )
    }

    private fun showPokemonInfo(name: String, type: String, @ColorRes typeColor: Int,
                                height: String, weight: String, @DrawableRes image: Int){
        val showPokemonInfo = Intent(this, PokemonAbout::class.java).apply {
            putExtra("PokemonName", name) //if i put showPokemonInfo code into onClick,
            putExtra("PokemonType", type) //<-- this becomes android.content.Intent.getType()
            putExtra("PokemonTypeColor", typeColor) //thanks kotlin ily kotlin
            putExtra("PokemonHeight", height)
            putExtra("PokemonWeight", weight)
            putExtra("PokemonImage", image)
        }
        startActivity(showPokemonInfo)
    }
}