import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:/Users/91834/Desktop/Core_Java_Complete/core_java/FileReadingWriting/file.txt");
        Scanner input = new Scanner(f);
        StringBuilder s = new StringBuilder();
        while(input.hasNext()){
            s.append(input.nextLine());
        }

        System.out.println(s);
    }
}
