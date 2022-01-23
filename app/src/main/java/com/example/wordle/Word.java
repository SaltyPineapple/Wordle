package com.example.wordle;

public class Word {

    public final int LENGTH = 5;
    public String word;


    public Word(String word){
        if(word.length() == LENGTH){
            this.word = word;
        }
    }



}
