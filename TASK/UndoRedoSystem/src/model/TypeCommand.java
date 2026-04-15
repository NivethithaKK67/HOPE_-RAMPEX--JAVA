package UndoRedoSystem.src.model;


import UndoRedoSystem.src.Service.TextEditor;

public class TypeCommand implements Command {

    private TextEditor editor;
    private String text;

    public TypeCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    public void execute() {
        editor.addText(text);
    }

    public void undo() {
        editor.removeText(text.length());
    }
}
