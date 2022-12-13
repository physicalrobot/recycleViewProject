package com.example.myapplication;

public class PokemonModel {
    String pokemonName;
    String pokemonAbbreviation;
    String pokemonAbbreviationSmall;
    int image;

    public PokemonModel(String pokemonName, String pokemonAbbreviation, String pokemonAbbreviationSmall, int image) {
        this.pokemonName = pokemonName;
        this.pokemonAbbreviation = pokemonAbbreviation;
        this.pokemonAbbreviationSmall = pokemonAbbreviationSmall;
        this.image = image;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonAbbreviation() {
        return pokemonAbbreviation;
    }

    public String getPokemonAbbreviationSmall() {
        return pokemonAbbreviationSmall;
    }

    public int getImage() {
        return image;
    }
}
