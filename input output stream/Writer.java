import java.io.IOException;
import java.io.FileWriter;

public class Writer {
  public static void main(String[] args) throws IOException{
    // Your code here:
    FileWriter write = new FileWriter("output.txt");
    String outputText = "Developer, by Grace";
    write.write(outputText);
    write.close();
  }
}