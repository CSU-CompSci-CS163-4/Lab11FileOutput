import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writer {
    PrintWriter outputFile;

    public Writer(String fileName) throws IOException{
        //TODO Student
        FileOutputStream fileStream = new FileOutputStream(fileName);
        outputFile = new PrintWriter(fileStream);
    }

    public void closeWriter() {
        outputFile.print("End of file.");
        outputFile.close();
    }

    /** Student Self-Explanation
     * 
     */
    public void logReverse(ArrayList<String> fileContents) {
        outputFile.println("Reversed file contents: ");

        //TODO Student
    }
    /** Student Self-Explanation
     * 
     */
    public void logMax(ArrayList<String> fileContents) {
        //TODO Student

        outputFile.print("The largest number in the file is: ");
        //You will want to print your max number on this line.
    }
    /** Student Self-Explanation
     * 
     */
    public void logDuplicates(ArrayList<String> fileContents) {
        outputFile.print("Duplicates found: ");

        //TODO Student
    }
}