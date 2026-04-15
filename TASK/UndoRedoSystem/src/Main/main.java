package UndoRedoSystem.src.Main;
import UndoRedoSystem.src.Service.*;
import UndoRedoSystem.src.model.*;
import UndoRedoSystem.src.Utilities.DemoData;
public class main {
    public static void main (String[] args) {

        TextEditor editor = new TextEditor();
        UndoRedoService manager = new UndoRedoService();

        // load demo texts
        for (String text : DemoData.getSampleTexts()) {
            manager.executeCommand(new TypeCommand(editor, text));
        }

        System.out.println("\nPerforming Undo...");
        manager.undo();
        manager.undo();

        System.out.println("\nPerforming Redo...");
        manager.redo();

        System.out.println("\nTyping new text...");
        manager.executeCommand(new TypeCommand(editor, "Project Done "));
    }
}
