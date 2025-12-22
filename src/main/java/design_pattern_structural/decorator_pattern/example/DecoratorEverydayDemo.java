package design_pattern_structural.decorator_pattern.example;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {
    static void main() throws Exception {
        File file = new File("./output.txt");
        boolean wasCreated = file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("Some text");

        dataOutputStream.close();
        outputStream.close();
    }
}
