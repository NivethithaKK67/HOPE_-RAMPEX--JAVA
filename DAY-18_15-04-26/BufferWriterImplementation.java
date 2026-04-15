import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class BufferWriterImplementation {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Sample.txt"));
            writer.write("Here, we have turn the file writer with true to append the data in the file");
            writer.newLine();
            writer.write("Finally, i have closed the appending operation and writing operation.now I am closing the file");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
