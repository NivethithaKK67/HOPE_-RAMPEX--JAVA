package UndoRedoSystem.src.Service;
import UndoRedoSystem.src.model.Command;
import java.util.*;

public class UndoRedoService {

    private ArrayList<Command> history = new ArrayList<>();
    private int currentIndex = -1;

    // Execute new command
    public void executeCommand(Command command) {
        command.execute();

        // remove redo history if new action happens
        while (history.size() > currentIndex + 1) {
            history.remove(history.size() - 1);
        }

        history.add(command);
        currentIndex++;
    }

    // Undo last command
    public void undo() {
        if (currentIndex < 0) {
            System.out.println("Nothing to undo!");
            return;
        }

        history.get(currentIndex).undo();
        currentIndex--;
    }

    // Redo command
    public void redo() {
        if (currentIndex >= history.size() - 1) {
            System.out.println("Nothing to redo!");
            return;
        }

        currentIndex++;
        history.get(currentIndex).execute();
    }
}