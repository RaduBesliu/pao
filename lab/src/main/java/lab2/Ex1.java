package main.java.lab2;

public class Ex1 {
    public static void main(String[] args) {
        char c = 't';
        Character cc = c; // auto-boxing

        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10); // boxing
        Integer i3 = Integer.valueOf("10"); // boxing

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println(i2 == i3);


        Integer i4 = Integer.valueOf(128);
        Integer i5 = Integer.valueOf("128");
        System.out.println(i4 == i5); // false, because 128 is not in the range [-128, 127]

        System.out.println("instanceOf: " + (i5 instanceof Number));

        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);

        long l1 = Long.parseLong("123456789");
        System.out.println(l1);

        boolean b2 = Boolean.parseBoolean("abc");
        System.out.println(b2);

//        Integer badInt = Integer.parseInt("abc");
//        System.out.println(badInt);
    }
}
