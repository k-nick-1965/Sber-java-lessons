package ru.sbrf.lesson;

public class Main {
    public static void main(String[] args) {
    }

    public byte method1(byte by, short sh) {
        return (byte) (by + (byte) sh);
    }

    public int method2(int i, long j) {
        return (int) (i * j);
    }

    public int getMaxNumber(int i, int j) {
        return i > j ? i : j;
    }

    public boolean isCharA(char c) {
        return c == 'A';
    }

    public boolean isCharNumber(char c) {
        return (c >= '0' && c <= '9');
    }

    public void method6() {
        for (int i = 0; i <= 30; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public void method7() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public int method8(char c) {
        return c;
    }

    public char method9(int i) {
        return (char) i;
    }

}
