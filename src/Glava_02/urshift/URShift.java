package Glava_02.urshift;

public class URShift
{
    public static void main(String[] args)
    {
        int i=-1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println();

        long l=-1;
        System.out.println(Long.toBinaryString(l));
        l>>>= 10;
        System.out.println(Long.toBinaryString(l));
        System.out.println();

        short s=-1;
        System.out.println(Integer.toBinaryString(s));
        s>>>= 10;
        System.out.println(Integer.toBinaryString(s));
        System.out.println();

        byte b=-1;
        System.out.println(Integer.toBinaryString(b));
        b>>>= 10;
        System.out.println(Integer.toBinaryString(b));
        System.out.println();

        b=-1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>= 10));
    }
}
