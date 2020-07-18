package com.nettys.api.tutorialspoint;

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker,int age) {
        System.out.println("Inside TextEditor constructor." + age);
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
