package se.gritacademy.demo.model;

public class Pokemon {

    private String name = "";
    private Integer hp = 0;
    private Integer attack = 0;
    private PokemonType type = PokemonType.GRASS;

    public Pokemon() {}

    public Pokemon(String name, Integer hp, Integer attack, PokemonType type) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public enum PokemonType {
        GRASS,
        WATER,
        FIRE
    }

}
