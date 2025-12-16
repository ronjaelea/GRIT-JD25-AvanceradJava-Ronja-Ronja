package se.gritacademy.demo.controller;

import org.springframework.web.bind.annotation.*;
import se.gritacademy.demo.database.Database;
import se.gritacademy.demo.model.Pokemon;

import java.util.List;

/*

    SpringBoot - Annoteringar

    @RestController - talar om att klassen är en SpringBoot RestController
    @RequestMapping(<mapping>) - styr vilken grundläggande path som
        metoderna i servicen skall ha.
    @GetMapping(<path>) - GET förfrågan skall kommit till denna metoden. Path styra
        extra path utöver det som är satt i RequestMapping
    @PostMapping(<path>)
    @PutMapping(<path>)
    @DeleteMapping(<path>)
    @PathVariable - används för att markera att en parameter skall hämtas från
        path:en - namnen måste stämma överens
    @RequestBody - används för att markera att en parameter skall hämtas från
        requestens body

 */


@RestController
@RequestMapping("/api/pokemon/")
public class PokemonController {

    @GetMapping
    public List<Pokemon> getPokemons() {
        // Fetch the only instance of the database and use getPokemons() on it
        return Database.getInstance().getPokemons();
    }

    @GetMapping("{name}")
    public Pokemon getPokemon(@PathVariable String name) {
        for (Pokemon pokemon : Database.getInstance().getPokemons()) {
            if(name.equals(pokemon.getName())) {
                return pokemon;
            }
        }
        return null;

//        return Database.getInstance().getPokemons().stream()
//                .filter(pokemon -> name.equals(pokemon.getName()))
//                .findFirst().orElse(null);
    }

    @PostMapping
    public void addPokemon(@RequestBody Pokemon pokemon) {
        // Fetch the only instance of the database
        Database db = Database.getInstance();
        // Add the pokemon to the database
        db.addPokemon(pokemon);
    }

    @PutMapping("{name}")
    public void updatePokemon(@RequestBody Pokemon pokemon, @PathVariable String name) {
        Database db = Database.getInstance();
        List<Pokemon> pokemons = db.getPokemons();

        for(int i=0; i<pokemons.size(); i++) {
            Pokemon p = pokemons.get(i);
            if(p.getName().equals(name)) {
                pokemons.set(i, pokemon);
            }
        }
    }

    @DeleteMapping("{name}")
    public void deletePokemon(@PathVariable String name){
        List<Pokemon> pokemons = Database.getInstance().getPokemons();
        for(Pokemon p : pokemons) {
            if(p.getName().equals(name)) {
                pokemons.remove(p);
                return;     // Only remove the first match
            }
        }


    }

}
