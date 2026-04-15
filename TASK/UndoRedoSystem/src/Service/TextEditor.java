package UndoRedoSystem.src.Service;
public class TextEditor {

    private StringBuilder content = new StringBuilder();

    public void addText(String text) {
        content.append(text);
        System.out.println("Typed: " + text);
        showContent();
    }

    public void removeText(int length) {
        int start = content.length() - length;
        content.delete(start, content.length());
        System.out.println("Undo typing...");
        showContent();
    }

    public void showContent() {
        System.out.println("Current Text: " + content.toString());
        System.out.println("----------------------");
    }
}