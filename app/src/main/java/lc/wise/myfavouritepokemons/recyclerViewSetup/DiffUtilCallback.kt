package lc.wise.myfavouritepokemons.recyclerViewSetup

import androidx.recyclerview.widget.DiffUtil
import lc.wise.myfavouritepokemons.pokemonRepo.Pokemon

class DiffUtilCallback (
    private val oldPokemonList: List<Pokemon>,
    private val newPokemonList: List<Pokemon>
): DiffUtil.Callback() {

    override fun getOldListSize() = oldPokemonList.size
    override fun getNewListSize() = newPokemonList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldPokemon = oldPokemonList[oldItemPosition]
        val newPokemon = newPokemonList[newItemPosition]
        return oldPokemon.id == newPokemon.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldPokemon = oldPokemonList[oldItemPosition]
        val newPokemon = newPokemonList[newItemPosition]
        return oldPokemon.name == newPokemon.name
                && oldPokemon.type == newPokemon.type
                && oldPokemon.typeColor == newPokemon.typeColor
                && oldPokemon.height == newPokemon.height
                && oldPokemon.weight == newPokemon.weight
                && oldPokemon.image == newPokemon.image
    }
}