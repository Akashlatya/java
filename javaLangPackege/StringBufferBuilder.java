package javaLangPackege;

public class StringBufferBuilder {
    public static void main(String[] args) {

        String s1 = new String("Hello");

        StringBuffer s2 = new StringBuffer("Hiiii");

        StringBuilder s3 = new StringBuilder("Byyyy");

        s1.concat("World"); // Strings are immutable
        s2.append(" World"); // StringBuffer can be modify
        s3.append(" World"); // StringBuilder also mutalbe as StringBuffer

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
