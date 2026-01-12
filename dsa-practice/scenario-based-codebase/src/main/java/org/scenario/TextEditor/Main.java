package org.scenario.TextEditor;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" Duniya");
        editor.show();

        editor.undo();
        editor.show();

        editor.redo();
        editor.show();
    }
}
