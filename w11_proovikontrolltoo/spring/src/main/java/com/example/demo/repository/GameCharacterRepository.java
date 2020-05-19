package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.GameCharacter;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters(){

        //Hardcoded
        characters = List.of(
            new GameCharacter("Kalle", 'M', "Goblin"),
            new GameCharacter("Jaan", 'M', "Juku"),
            new GameCharacter("Peeter", 'F', "Wizard"),
            new GameCharacter("Mati", 'F', "Healer")
            );

        return characters;
    }
}