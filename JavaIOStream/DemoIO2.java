package JavaIOStream;

import java.io.*;

public class DemoIO2 {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.txt");) {

            String str = "earn Java Programming.";

            byte b[] = str.getBytes();

            fos.write(b);

            fos.close();

        }

    }

}
