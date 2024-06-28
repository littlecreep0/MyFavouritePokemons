package lc.wise.myfavouritepokemons.recyclerViewSetup

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import lc.wise.myfavouritepokemons.databinding.ItemPokemonBinding
import lc.wise.myfavouritepokemons.pokemonRepo.Pokemon

class PokemonListAdapter : Adapter<PokemonViewHolder>() {

    var onClick: (Pokemon) -> Unit = {}
    private var pokemonList = emptyList<Pokemon>()
    override fun getItemCount() = pokemonList.size

    fun showPokemonList(newPokemonList: List<Pokemon>) {
        val diffCallback = DiffUtilCallback(pokemonList, newPokemonList)
        val diffPokemons = DiffUtil.calculateDiff(diffCallback)
        pokemonList = newPokemonList
        diffPokemons.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(
            ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokemonList[position], onClick)
    }
}