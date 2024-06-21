package lc.wise.myfavouritepokemons.pokemonRepo

import lc.wise.myfavouritepokemons.R

object PokemonRepo {
    private val pokemonList = listOf(
        Pokemon(
            id = 1,
            name = "Eevee",
            type = "Normal",
            typeColor = R.color.normal,
            height = "0.3",
            weight = "6.5",
            image = R.drawable.eevee
        ),
        Pokemon(
            id = 2,
            name = "Vaporeon",
            type = "Water",
            typeColor = R.color.water,
            height = "1",
            weight = "29.0",
            image = R.drawable.vaporeon
        ),
        Pokemon(
            id = 3,
            name = "Jolteon",
            type = "Electric",
            typeColor = R.color.electric,
            height = "0.8",
            weight = "24.5",
            image = R.drawable.jolteon
        ),
        Pokemon(
            id = 4,
            name = "Flareon",
            type = "Fire",
            typeColor = R.color.fire,
            height = "0.9",
            weight = "25.0",
            image = R.drawable.flareon
        ),
        Pokemon(
            id = 5,
            name = "Espeon",
            type = "Psychic",
            typeColor = R.color.psychic,
            height = "0.9",
            weight = "26.5",
            image = R.drawable.espeon
        ),
        Pokemon(
            id = 6,
            name = "Umbreon",
            type = "Dark",
            typeColor = R.color.dark,
            height = "1",
            weight = "27.0",
            image = R.drawable.umbreon
        ),
        Pokemon(
            id = 7,
            name = "Leafeon",
            type = "Grass",
            typeColor = R.color.grass,
            height = "1",
            weight = "25.5",
            image = R.drawable.leafeon
        ),
        Pokemon(
            id = 8,
            name = "Glaceon",
            type = "Ice",
            typeColor = R.color.ice,
            height = "0.8",
            weight = "25.9",
            image = R.drawable.glaceon
        ),
        Pokemon(
            id = 9,
            name = "Sylveon",
            type = "Fairy",
            typeColor = R.color.fairy,
            height = "1",
            weight = "23.5",
            image = R.drawable.sylveon
        )
    ).associateBy { it.id }

    fun getPokemonList() = pokemonList
}