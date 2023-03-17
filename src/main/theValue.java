package main;

public class theValue {
    public static void main(String[] args) {
        byte valByte = 127;
        short valShort = 32767;
        char valChar = 'A';
        int valInt = 2147483647;
        long valLong = 9223372036854775807L;

        System.out.println("valByte : " + valByte);
        System.out.println("valShort : " + valShort);
        System.out.println("valChar : " + valChar);
        System.out.println("valInt : " + valInt);
        System.out.println("valLong : " + valLong);

        int val1 = 0b1011;
        int val2 = 0206;
        int val3 = 365;
        int val4 = 0xB3;

        System.out.println("val1 : " + val1);
        System.out.println("val2 : " + val2);
        System.out.println("val3 : " + val3);
        System.out.println("val4 : " + val4);
    }
}
