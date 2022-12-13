package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PokemonModel> pokemonModels = new ArrayList<>();

    int [] pokemonImages = {R.drawable.ic_baseline_adjust_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);


        setUpPokemonModels();

       //create adapter AFTER you set up your models!!

        PokemonRecyclerViewAdapter adapter = new PokemonRecyclerViewAdapter(this, pokemonModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpPokemonModels(){
        String[] pokemonNames = getResources().getStringArray(R.array.pokemon_full_txt);
        String[] pokemonNamesAbbreviation = getResources().getStringArray(R.array.pokemon_three_letter_txt);
        String[] pokemonNamesAbbreviationSmall = getResources().getStringArray(R.array.pokemon_one_letter_txt);


        for (int i = 0; i<pokemonNames.length; i++){
            pokemonModels.add(new PokemonModel(
                    pokemonNames[i],
                    pokemonNamesAbbreviation[i],
                    pokemonNamesAbbreviationSmall[i],
                    pokemonImages[0]));
        }
    }


}