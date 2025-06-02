import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter f = new FileWriter("C:/Users/91834/Desktop/Core_Java_Complete/core_java/FileReadingWriting/file.txt");
        System.out.println("Enter input");
        String value= input.nextLine();
        f.write(value);
        f.close();

    }
}
