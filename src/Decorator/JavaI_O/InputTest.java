package Decorator.JavaI_O;

import java.io.*;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;

        InputStream in =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("test.txt"))
                );

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        in.close();
    }

}
