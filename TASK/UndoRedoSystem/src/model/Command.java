package UndoRedoSystem.src.model;
public interface Command {
    void execute();
    void undo();
}
    