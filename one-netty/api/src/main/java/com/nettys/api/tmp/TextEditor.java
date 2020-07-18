package com.nettys.api.tmp;

import org.springframework.beans.factory.annotation.Autowired;
public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;

//    public TextEditor() {
//        System.out.println("1111111." );
//    }
    public void setSpellChecker( SpellChecker spellChecker ){
        System.out.println("11111111");
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}