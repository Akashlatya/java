package javaLangPackege;

public class wrapDemo {
    public static void main(String[] args) {

        // Integer
        Integer i = Integer.valueOf(19);
        Integer a = 10;

        // short
        Short s = Short.valueOf("30");

        // Byte
        Byte bt = 10;
        Byte b = Byte.valueOf(bt);

        // Double

        Double d = Double.valueOf(19.0);

        // float
        Float fl = Float.valueOf(32.43f);

        // Charector
        Character ch = Character.valueOf('a');

        // Boolean
        Boolean bl = Boolean.valueOf("true");

        // -------------------------------------
        // Boxing and AutoBoxing
        Integer in = 20;
        Integer ni = Integer.valueOf(in);
        int ii = ni;

        System.out.println(d.hashCode());
        System.out.println(i.hashCode());
        System.out.println(i.equals(d));
    }

}
