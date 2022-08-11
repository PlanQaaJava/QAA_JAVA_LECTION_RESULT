import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    @SneakyThrows
    public static void main(String[] args) {

        Throwable throwable;

        Exception exception;
        Error error;

        RuntimeException runtimeException;
        IOException ioException;

        FileReader fr = null;
        try {
            File f = new File("..\\QAA_JAVA_LECTION_RESULT\\Java_6\\file.txt");
            fr = new FileReader(f);
            char[] array = new char[10];
            fr.read(array);   // чтение содержимого массива
            for (char c : array)
                System.out.print(c);   // вывод символов на экран, один за одним
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        System.out.println("------------------------");

        try (FileReader fr2 = new FileReader("..\\QAA_JAVA_LECTION_RESULT\\Java_6\\file.txt")) {
            char[] array = new char[10];
            fr2.read(array);   // чтение содержимого массива
            for (char c : array)
                System.out.print(c);   // вывод символов на экран, один за одним
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
