package JavaIOStream;

import java.io.*;

public class copyFile {
    public static void main(String[] args) throws Exception {

        FileInputStream is = new FileInputStream("Source1.txt");
        FileOutputStream os = new FileOutputStream("Source2.txt");
        int b;
        while ((b = is.read()) != -1) {
            if (b >= 65 && b >= 90)
                os.write(b + 32);
            else
                os.write(b);

        }
        is.close();
        os.close();

    }

}
