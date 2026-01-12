package org.scenario.TextEditor;
import java.util.Stack;

public class TextEditor {
	String content = "";
	Stack<Action> undoStack = new Stack<>();
	Stack<Action> redoStack = new Stack<>();
	
	// Insert
	void insert(String text) {
		content += text;
		undoStack.push(new Action("Insert",text));
		redoStack.clear();
	}
	
	// Delete
	void delete(int length) {
		String removed = content.substring(content.length() - length);
		content = (content.substring(0,content.length() - length));
		undoStack.push(new Action("delete",removed));
	}
	
	// Undo
	void undo() {
		if(undoStack.isEmpty()) return;
		Action a = undoStack.pop();
		if(a.type.equals("insert")) {
			content = content.substring(0,content.length()-a.text.length());
		}else {
			content += a.text;
		}
		redoStack.push(a);
	}
	
	//	Redo
	void redo() {
        if (redoStack.isEmpty()) return;
        Action a = redoStack.pop();
        if (a.type.equals("insert")) {
            content += a.text;
        } else {
            content = content.substring(0, content.length() - a.text.length());
        }
        undoStack.push(a);
    }
	
	// Show
    void show() {
        System.out.println("Text: " + content);
    }
}
