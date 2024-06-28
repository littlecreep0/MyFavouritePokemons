package lc.wise.myfavouritepokemons.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import lc.wise.myfavouritepokemons.R
import lc.wise.myfavouritepokemons.databinding.ActivityPokemonListBinding
import lc.wise.myfavouritepokemons.pokemonRepo.PokemonRepo
import lc.wise.myfavouritepokemons.recyclerViewSetup.PokemonListAdapter

class PokemonList : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pokemonList.addItemDecoration(DividerItemDecoration(
            this,
            LinearLayoutManager.VERTICAL
        ).apply {
            setDrawable(resources.getDrawable(R.drawable.item_divider))
        })

        val adapter = PokemonListAdapter()
        binding.pokemonList.adapter = adapter

        val pokemonList = PokemonRepo.getPokemonList()
        adapter.showPokemonList(pokemonList)
        adapter.onClick = { pokemon ->
            val showPokemonInfo = Intent(this@PokemonList, PokemonAbout::class.java).apply {
                putExtra("PokemonName", pokemon.name)
                putExtra("PokemonType", pokemon.type)
                putExtra("PokemonTypeColor", pokemon.typeColor)
                putExtra("PokemonHeight", pokemon.height)
                putExtra("PokemonWeight", pokemon.weight)
                putExtra("PokemonImage", pokemon.image)
            }
            startActivity(showPokemonInfo)
        }
    }
}