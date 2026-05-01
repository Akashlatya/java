package JavaIOStream;

import java.io.*;

public class DemoIO {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.txt");) {

            String str = "Learn Java Programming with Akash.";

            byte b[] = str.getBytes();

            fos.write(b);

            fos.close();

        }

    }

}