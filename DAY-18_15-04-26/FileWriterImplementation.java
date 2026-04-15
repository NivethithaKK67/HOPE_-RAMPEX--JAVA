import java.io.*;
public class FileWriterImplementation {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("sample.txt")) {
            writer.write("Welcome to File Handling\n This is Hope Batch 1.");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
