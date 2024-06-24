package lc.wise.myfavouritepokemons.recyclerViewSetup

import androidx.recyclerview.widget.RecyclerView
import lc.wise.myfavouritepokemons.databinding.ItemPokemonBinding
import lc.wise.myfavouritepokemons.pokemonRepo.Pokemon

class PokemonViewHolder(
    private val binding: ItemPokemonBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(pokemon: Pokemon, onClick: (Pokemon) -> Unit){
        with(binding) {
            pokemonImage.setImageResource(pokemon.image)
            pokemonName.text = pokemon.name
            root.setOnClickListener {
                onClick(pokemon)
            }
        }
    }
}