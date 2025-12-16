package se.gritacademy.demo.database;

import se.gritacademy.demo.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance;
    private List<Pokemon> pokemons = new ArrayList<>();

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

}
